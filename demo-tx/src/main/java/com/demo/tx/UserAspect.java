package com.demo.tx;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
@Slf4j
public class UserAspect {

    @Before("execution(* com.demo.tx.*.*(..))")
    public void doAccessCheck() {
        log.info("before");
    }

}
