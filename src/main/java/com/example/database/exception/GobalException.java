package com.example.database.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.*;

@RestControllerAdvice
public class GobalException {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> notValid(MethodArgumentNotValidException ex){
        Map<String,List<String>> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(
                e->{
                    String field = e.getField();
                    String message = e.getDefaultMessage();

                    errors.computeIfAbsent(field, k -> new ArrayList<>()).add(message);
                }
        );

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
