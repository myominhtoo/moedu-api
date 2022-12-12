package com.lio.moeduhouseapi.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HttpResponse<T>{
    private LocalDateTime timestamp;
    private String message;
    private Boolean ok;
    private HttpStatus httpStatus;
    private Integer httpStatusCode;
    private T data;
}
