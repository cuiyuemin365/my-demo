package com.example.apiceng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-11-10 13:11
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/aaa")
    User get(){
        User user = feignService.get();
        return user;
    }

}
