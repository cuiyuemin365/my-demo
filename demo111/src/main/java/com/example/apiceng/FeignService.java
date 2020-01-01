package com.example.apiceng;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-11-10 13:11
 */
@FeignClient(value = "asdfwq",contextId = "asdfw",url = "127.0.0.1:9999")
public interface FeignService {

    @GetMapping("/aaa")
    User get();

}
