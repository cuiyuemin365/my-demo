package com.example.avator;

import com.googlecode.aviator.AviatorEvaluator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-11-06 09:58
 */
public class Test1 {

    public static void main(String[] args) {
        String yourName = "Michael";
        Map<String, Object> env = new HashMap<>();
        env.put("yourName", null);
        Boolean result = (Boolean)AviatorEvaluator.execute("yourName == 4", env);
        System.out.println(result); // hello Michael
    }

}
