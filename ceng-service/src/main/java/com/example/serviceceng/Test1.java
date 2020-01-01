package com.example.serviceceng;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-12-11 14:32
 */
@Slf4j
public class Test1 {

    public static void main(String[] args) {
        Object a = new String[] {};
        log.info("a{}", a.getClass().isArray());
    }
}
