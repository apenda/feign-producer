package com.apenda.core.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rui.zhou
 * @date 2021/10/16 12:12
 **/
//@Configuration
public class OpenFeignConfig {

    @Bean
    public Contract useFeignAnnotations() {
        return new Contract.Default();
    }

}
