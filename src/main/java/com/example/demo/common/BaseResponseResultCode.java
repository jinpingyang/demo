package com.example.demo.common;

import com.example.demo.dto.ResponseResultCodeDto;

/**
 * @author yangjinping
 * @createDate 2024/3/21
 **/

public class BaseResponseResultCode {
    public static final ResponseResultCodeDto SUCCESS = ResponseResultCodeDto.createSuccessResult();
    public static final ResponseResultCodeDto ERROR = ResponseResultCodeDto.createErrorResult(40000, "未知错误");
    public static final ResponseResultCodeDto SYSTEM_ERROR = ResponseResultCodeDto.createErrorResult(40001, "系统错误");
    public static final ResponseResultCodeDto ID_NOT_NULL = ResponseResultCodeDto.createErrorResult(40100, "没有找到id");
    public static final ResponseResultCodeDto ELEMENT_NOT_FOUND = ResponseResultCodeDto.createErrorResult(40101, "没有找到对象");
    public static final ResponseResultCodeDto PARAM_NOT_EMPTY = ResponseResultCodeDto.createErrorResult(40102, "参数不能为空");
    public static final ResponseResultCodeDto CONTENT_INVALID = ResponseResultCodeDto.createErrorResult(40103, "内容无效");

}
