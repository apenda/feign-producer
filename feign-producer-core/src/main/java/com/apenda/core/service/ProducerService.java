package com.apenda.core.service;

import com.apenda.share.dto.ProductionDTO;

/**
 * @author rui.zhou
 * @date 2021/10/16 11:36
 **/
public interface ProducerService {

    /**
     * 生产者测试
     *
     * @param productionDTO 入参
     * @return object
     */
    Object doSomeThing(ProductionDTO productionDTO);

}
