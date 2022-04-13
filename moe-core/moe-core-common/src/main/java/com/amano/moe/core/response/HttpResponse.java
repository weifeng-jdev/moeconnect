package com.amano.moe.core.response;

import lombok.Data;
import lombok.ToString;

/**
 * @Description 通用请求响应内容
 * @ClassName HttpResponse
 * @Author 卫峰
 * @date 2022.04.13 16:19
 */
@Data
@ToString
public class HttpResponse<T> {
    /**
     * 响应状态码: 定义同http响应码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;
}
