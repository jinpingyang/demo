package com.example.demo.dto;

import com.example.demo.common.BaseResponseResultCode;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/

public class ResponseResult {

    public ResponseResult() {
    }

    public static ResponseResultDto createSuccessResultWithData(Object data) {
        return createSuccessResult(BaseResponseResultCode.SUCCESS, data);
    }

    public static ResponseResultDto createSuccessResultWithData() {
        return createSuccessResult(BaseResponseResultCode.SUCCESS, (Object)null);
    }

    public static ResponseResultDto createSuccessResult(ResponseResultCodeDto responseResultCodeDto, Object data) {
        return createBasicResult(responseResultCodeDto, data);
    }

    public static ResponseResultDto createFailResult(Exception error) {
        return createFailResult(error.getMessage(), BaseResponseResultCode.SYSTEM_ERROR.getCode(), (Object)null);
    }

    public static ResponseResultDto createFailResult(ResponseResultCodeDto responseResultCodeDto) {
        return createFailResult((ResponseResultCodeDto)responseResultCodeDto, (Object)null);
    }

    public static ResponseResultDto createFailResult(ResponseResultCodeDto responseResultCodeDto, Object data) {
        return createBasicResult(responseResultCodeDto, data);
    }

    public static ResponseResultDto createFailResult(String message, Integer code) {
        return createFailResult(message, code, (Object)null);
    }

    public static ResponseResultDto createFailResult(String message, Integer code, Object data) {
        return createBasicResult(ResponseResultCodeDto.createErrorResult(code, message), data);
    }

    private static ResponseResultDto createBasicResult(ResponseResultCodeDto responseResultCodeDto, Object data) {
        return new ResponseResultDto(responseResultCodeDto.getCode(), responseResultCodeDto.getMsg(), data);
    }
}
