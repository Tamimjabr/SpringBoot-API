package com.example.API.Spring.Boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice // saying that the class is used for exception handling
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) {
        HttpStatus httpStatus=e.getHttpStatus();
        ApiException apiException =  new ApiException(
            e.getMessage(),
            httpStatus,
            ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException,httpStatus);
    }
}
