package com.gary.example.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Result<T> {
    private final int code;
    private final String msg;
    private final T data;

    public Result(int code, String msg) {
        this(code, msg, null);
    }

    public Result(ResultCode code) {
        this(code, null);
    }

    public Result(ResultCode code, T data) {
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.data = data;
    }
}
