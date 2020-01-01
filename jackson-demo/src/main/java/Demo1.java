import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-10-26 19:28
 */
@Slf4j
public class Demo1 {

    public static void main(String[] args) throws Exception {
//        String content = "{\"id\":1,\"name\":\"312412\"}";
        Map<String,Object> content = new HashMap<>();
        content.put("id", 12);
        content.put("name", "132412");
        K2 k2 =
            Jackson2ObjectMapperBuilder.json().failOnUnknownProperties(false).build().convertValue(content, K2.class);
        // K1 k1 = new K1();
        // k1.setId(1L);
        // k1.setName("312412");
        // log.info("{}", Jackson2ObjectMapperBuilder.json().propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
        // .build().writeValueAsString(k1));
    }

}
