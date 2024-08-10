package com.guaranitech.set.sifen_api.exception;

import java.time.ZonedDateTime;

import javax.xml.soap.SOAPException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.roshka.sifen.core.exceptions.SifenException;

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
    @ExceptionHandler(SifenException.class)
    @ResponseBody
    public ErrorResponse handleSifenException(SifenException e) {
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

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(SOAPException.class)
    @ResponseBody
    public ErrorResponse handleSOAPException(SOAPException e) {
        return ErrorResponse
                .builder()
                .errorMessage(e.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .zonedDateTime(ZonedDateTime.now())
                .build();
    }
}
