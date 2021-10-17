package com.apenda.share.service;

import com.apenda.share.dto.ProductionDTO;
import feign.Headers;
import feign.RequestLine;

/**
 * @author rui.zhou
 **/
public interface ProducerShareService {

    /**
     * 生产者测试
     * @param productionDTO 入参
     * @return Object
     */
    @RequestLine("POST /producer/doSomeThing")
    @Headers("Content-Type:application/json;charset=UTF-8")
    Object doSomeThing(ProductionDTO productionDTO);

}
