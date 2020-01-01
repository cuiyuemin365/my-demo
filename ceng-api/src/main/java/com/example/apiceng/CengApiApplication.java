package com.example.apiceng;

import com.example.serviceceng.DemoClient;
import com.example.serviceceng.User;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.serviceceng")
@RestController
public class CengApiApplication {

    @Autowired
    private DemoClient demoClient;

    public static void main(String[] args) {
        SpringApplication.run(CengApiApplication.class, args);
    }

    @RequestMapping(value = "api/query/{key}", method = RequestMethod.POST)
    public void query(@PathVariable("key") String key, @RequestBody Map<String, Object> user) {
        demoClient.query(key, user);
    }

}
