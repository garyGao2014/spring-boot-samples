package com.gary.example.web;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    响应成功(2000, "success"),
    未知错误(5000, "未知错误"),
    参数校验失败(5001, "参数校验失败"),
    ;
    private int code;
    private String msg;
}
