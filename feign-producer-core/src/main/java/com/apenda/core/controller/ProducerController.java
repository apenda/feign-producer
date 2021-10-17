package com.apenda.core.controller;

import com.apenda.core.service.ProducerService;
import com.apenda.share.dto.ProductionDTO;
import com.apenda.share.service.ProducerShareService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author rui.zhou
 * @date 2021/10/16 11:35
 **/
@RestController
@RequestMapping("producer")
public class ProducerController implements ProducerShareService {

    @Resource
    private ProducerService producerService;

    @Override
    @PostMapping("doSomeThing")
    public Object doSomeThing(@RequestBody @Validated ProductionDTO productionDTO) {
        return producerService.doSomeThing(productionDTO);
    }

}
