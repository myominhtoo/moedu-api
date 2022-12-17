package com.lio.moeduhouseapi.util;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.lio.moeduhouseapi.model.dto.HttpResponse;

public class HttpHelper<T>{

    public  HttpResponse<T> getHttpResponse( boolean isOK , String message , String errorMsg , T data ){
        return new HttpResponse<>(
            LocalDateTime.now(),
            isOK ? message : errorMsg ,
            isOK,
            isOK ? HttpStatus.OK : HttpStatus.BAD_REQUEST , 
            isOK ? HttpStatus.OK.value() : HttpStatus.BAD_REQUEST.value(),
            data
        );
    }

}
