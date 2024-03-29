package com.example.demo.dto;

import lombok.Data;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/
public class ResponseResultCodeDto {

    private static final Integer SUCCESS_CODE = 20000;
    private static final Integer ERROR_CODE = 40000;
    private static final String SUCCESS_STRING = "成功";
    private Integer code;
    private String msg;

    private ResponseResultCodeDto(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ResponseResultCodeDto createSuccessResult() {
        return new ResponseResultCodeDto(SUCCESS_CODE, "成功");
    }

    public static ResponseResultCodeDto createSuccessResult(String msg) {
        return new ResponseResultCodeDto(SUCCESS_CODE, msg);
    }

    public static ResponseResultCodeDto createErrorResult(Integer code, String msg) {
        return new ResponseResultCodeDto(code, msg);
    }

    public static ResponseResultCodeDto createErrorResult(Integer code, String msg, Object... msgParam) {
        return new ResponseResultCodeDto(code, String.format(msg, msgParam));
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public ResponseResultCodeDto setMsgParam(Object... msgParam) {
        return new ResponseResultCodeDto(this.code, String.format(this.msg, msgParam));
    }

    public String toString() {
        return "ResponseResultCodeDto{code=" + this.code + ", msg='" + this.msg + '\'' + '}';
    }
}
