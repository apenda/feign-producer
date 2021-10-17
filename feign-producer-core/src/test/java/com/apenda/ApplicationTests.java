package com.apenda;

import com.apenda.core.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@Configuration
@SpringBootTest(classes = { Application.class })
class ApplicationTests {

    @Test
    void contextLoads() {

    }

}
