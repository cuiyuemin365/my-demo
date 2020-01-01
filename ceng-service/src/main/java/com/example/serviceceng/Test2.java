package com.example.serviceceng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-12-11 14:32
 */
@Slf4j
public class Test2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>() {
            {
                put("1", "11");
                put("2", "22");
                put("3", "33");
            }
        };
        String[] aggRootFieldArr = new String[] {};
        List<Map<String, String>> list = new ArrayList<>();
        list.add(map);
        Map map2 =
            list.stream()
                .collect(
                    Collectors
                        .toMap(
                            (lineItem) -> String.join("|",
                                Arrays.stream(aggRootFieldArr)
                                    .map(fieldNameItem -> Optional.ofNullable(lineItem.get(fieldNameItem)).orElse(""))
                                    .collect(Collectors.toList())),
                            lineItem -> lineItem, (v1, v2) -> v2, TreeMap::new));
        log.info("{}", map2);
        log.info("{}",
            Arrays.stream(aggRootFieldArr).map(fieldNameItem -> fieldNameItem + "a").collect(Collectors.toList()));
    }
}
