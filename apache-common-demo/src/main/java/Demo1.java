import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author ：cuiyuemin
 * @date ：Created in 2019-11-25 00:53
 */
public class Demo1 {

    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        Map<String, A> list2 = list.stream().filter(item -> Objects.nonNull(item))
            .collect(Collectors.toMap(A::getId, Function.identity(), (key1, key2) -> key2));
        System.out.println(list2.get("1324"));
    }
}
