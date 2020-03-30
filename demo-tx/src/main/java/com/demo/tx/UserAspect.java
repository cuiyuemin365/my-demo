package com.demo.tx;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class UserAspect {

    @Before("execution(* com.demo.tx.*.*(..))")
    public void doAccessCheck() {
        log.info("before");
    }

}
