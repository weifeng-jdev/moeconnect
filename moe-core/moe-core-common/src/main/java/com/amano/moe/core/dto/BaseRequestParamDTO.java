package com.amano.moe.core.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @Description
 * @ClassName BaseRequestParamDTO
 * @Author 卫峰
 * @date 2022.04.13 16:23
 */
@Data
@ToString
public class BaseRequestParamDTO {
    /**
     * 分页参数: 单页数据量
     */
    private Integer pageSize;
    /**
     * 分页参数: 页码
     */
    private Integer pageNum;
}
