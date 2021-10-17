package com.apenda.core.service.impl;

import com.apenda.core.service.ProducerService;
import com.apenda.share.dto.ProductionDTO;
import org.springframework.stereotype.Service;

/**
 * @author rui.zhou
 * @date 2021/10/16 11:37
 **/
@Service
public class ProducerServiceImpl implements ProducerService {

    @Override
    public Object doSomeThing(ProductionDTO productionDTO) {
        return productionDTO;
    }

}
