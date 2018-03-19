package com.ahn.bangsong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 모든 컨트롤러에서 발생하는 예외를 잡는 컨트롤러
 */
@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(BangsongException.class)
    public ResponseEntity<String> handleException(BangsongException e){
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
