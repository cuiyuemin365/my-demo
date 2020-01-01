package com.example.serviceceng;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-12-03 15:41
 */
@Slf4j
@RestController
public class DemoController implements DemoClient {

    @Override
    public void query(String key, Map<String,Object> user) {
        log.info("获取参数：{},{}", key, user);
    }
}
