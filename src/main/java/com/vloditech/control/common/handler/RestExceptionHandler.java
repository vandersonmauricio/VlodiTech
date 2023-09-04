package com.vloditech.control.common.handler;

import com.vloditech.control.common.exceptions.exception.BadRequestException;
import com.vloditech.control.common.exceptions.details.BadRequestExceptionBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
//TODO: implementar novos handlers para as excecoes diferentes.
@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestExceptionBuilder> handlerBadRequestException(BadRequestException badRequestException) {
        return new ResponseEntity<>(BadRequestExceptionBuilder.builder()
                .title("Bad Request Exception")
                .details(badRequestException.getMessage())
                .developerMsg(badRequestException.getClass().getName())
                .timestamp(LocalDateTime.now())
                .build(), HttpStatus.BAD_REQUEST);
    }
}