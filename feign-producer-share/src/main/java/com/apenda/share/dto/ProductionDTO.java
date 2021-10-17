package com.apenda.share.dto;

import lombok.Data;
import javax.validation.constraints.NotBlank;

/**
 * 生产者测试
 *
 * @author rui.zhou
 **/
@Data
public class ProductionDTO {

    /**
    * 名称
    */
    @NotBlank(message = "名称不能为空")
    private String name;

    /**
     * 测试字段
     */
    private String test;

}
