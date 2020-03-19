package com.admin.demospringmvc;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
@Slf4j
public class DemoSpringmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringmvcApplication.class, args);
    }

    @GetMapping("/getMap")
    public void getMap(@RequestParam Map<String, Object> dataMap,
                       @RequestParam("key") String [] key) {
        log.info(JSON.toJSONString(dataMap));
        log.info(JSON.toJSONString(key));
    }

}
