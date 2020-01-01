package com.example.serviceceng;

import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-12-03 15:36
 */
@FeignClient(url = "127.0.0.1:8090", name = "demoClient")
public interface DemoClient {

    @RequestMapping(value = "api/query/{key}", method = RequestMethod.POST)
    void query(@PathVariable("key") String key, @RequestBody Map<String,Object> user);

}