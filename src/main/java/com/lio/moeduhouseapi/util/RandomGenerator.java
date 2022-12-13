package com.lio.moeduhouseapi.util;

import static com.lio.moeduhouseapi.model.constant.MoEdu.*;
import com.lio.moeduhouseapi.model.entity.Role;

import java.util.Random;

public class RandomGenerator {
    private RandomGenerator(){};

    public static String generateId(Role role){
        String postfixId = getPostfixForId(role.getId());
        boolean isNumberTurn = false;
        String generatedId = "";

        Random random = new Random();
        for( int i = 0 ; i < ID_LENGTH ; i++ ){
            if( isNumberTurn ){
                generatedId += String.valueOf(NUMBERS[random.nextInt(NUMBERS.length - 1)]);
            }else {
               generatedId += String.valueOf(CHARACTERS[random.nextInt(CHARACTERS.length -1 )]) ;
            }
            isNumberTurn = random.nextBoolean();
        }
        generatedId += postfixId;
        return generatedId;
    }

    private static String getPostfixForId( Integer roleId ){
        switch(roleId){
            case 1 :
                return ADMIN_PREFIX;
            case 2 :
                return TEACHER_PREFIX;
            case 3:
                return STUDENT_PREFIX;
        }
        return null;
    }
}
