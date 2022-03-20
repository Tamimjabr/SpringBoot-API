package com.example.API.Spring.Boot.exception;

import org.springframework.http.HttpStatus;



public class ConflictException extends ApiRequestException {
    private final HttpStatus status = HttpStatus.CONFLICT;

    public ConflictException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return status;
    }
}
