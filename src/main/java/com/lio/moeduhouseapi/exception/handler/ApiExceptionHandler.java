package com.lio.moeduhouseapi.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lio.moeduhouseapi.model.dto.HttpResponse;
import static com.lio.moeduhouseapi.exception.custom.Index.*;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ApiExceptionHandler {
    
    /*
     * exception for duplicate role creation
     */
    @ExceptionHandler({ DuplicateRoleException.class })
    public ResponseEntity<HttpResponse<Boolean>> duplicateRoleException( DuplicateRoleException e ){
        HttpResponse<Boolean>  httpResponse = new HttpResponse<Boolean>(
            LocalDateTime.now(), 
            "Dupicate Role,Please Input Other Role!",
            false , 
            HttpStatus.BAD_REQUEST , 
            HttpStatus.BAD_REQUEST.value() , 
            false );
        return ResponseEntity.ok().body(httpResponse);
    }

    /*
     * accessing role with absent role id
     */
    @ExceptionHandler({ InvalidRoleIdException.class })
    public ResponseEntity<HttpResponse<Boolean>> invalidRoleIdException( InvalidRoleIdException e ){
        HttpResponse<Boolean>  httpResponse = new HttpResponse<Boolean>(
            LocalDateTime.now(), 
            "Invalid Role Id!",
            false , 
            HttpStatus.BAD_REQUEST , 
            HttpStatus.BAD_REQUEST.value() , 
            false );
        return ResponseEntity.ok().body(httpResponse);
    }

    /*
     * updating to default roles 
     * ADMIN,TEACHER,STUDENT
     */
    @ExceptionHandler({ UnableUpdateRoleException.class })
    public ResponseEntity<HttpResponse<Boolean>> unableUpdateRoleExceptiResponseEntity( UnableUpdateRoleException e ){
        HttpResponse<Boolean>  httpResponse = new HttpResponse<Boolean>(
            LocalDateTime.now(), 
            "Unable to update this Role!",
            false , 
            HttpStatus.BAD_REQUEST , 
            HttpStatus.BAD_REQUEST.value() , 
            false );
        return ResponseEntity.ok().body(httpResponse);
    }

}
