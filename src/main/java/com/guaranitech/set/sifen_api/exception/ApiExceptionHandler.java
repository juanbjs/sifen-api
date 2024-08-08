package com.guaranitech.set.sifen_api.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(FileNotFoundExceptionHandler.class)
    @ResponseBody
    public ErrorResponse handleFileNotFoundException(FileNotFoundExceptionHandler e) {
        return ErrorResponse
                .builder()
                .errorMessage(e.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .zonedDateTime(ZonedDateTime.now())
                .build();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(SifenExceptionHandler.class)
    @ResponseBody
    public ErrorResponse handleSifenException(SifenExceptionHandler e) {
        return ErrorResponse
                .builder()
                .errorMessage(e.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .zonedDateTime(ZonedDateTime.now())
                .build();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(NullPointerExceptionHandler.class)
    @ResponseBody
    public ErrorResponse handleNullPointerException(NullPointerExceptionHandler e) {
        return ErrorResponse
                .builder()
                .errorMessage(e.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .zonedDateTime(ZonedDateTime.now())
                .build();
    }
}
