import com.demo.tx.DemoApplication;
import com.demo.tx.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserTest {


    @Autowired
    private UserService userService;

    @org.junit.Test
    public void test() {
        userService.queryUser();
    }
}
