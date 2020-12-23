package com.gary.example.web;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionControllerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        ObjectError error = e.getBindingResult().getAllErrors().get(0);
        return new Result<String>(ResultCode.参数校验失败.getCode(), error.getDefaultMessage());
    }

    @ExceptionHandler(APIException.class)
    public Result<String> APIExceptionHandler(APIException e) {
        return new Result<String>(e.getCode(), e.getMsg());
    }
}
