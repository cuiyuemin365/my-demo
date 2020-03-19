package com.damin.demopdf;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
class DemoPdfApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void run1() throws Exception {
        JSON.parseObject("", Object.class);
    }

}
