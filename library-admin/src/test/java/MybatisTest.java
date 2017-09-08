import com.cz.library.controller.IndexController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MybatisTest extends AbstractTest {

    @Autowired
    com.cz.library.mybatis.TestMapper testMapper;

    @Autowired
    IndexController indexController;

    @Test
    public void test(){
        com.cz.library.mybatis.Test test = new com.cz.library.mybatis.Test();
        test.setId(1);
        test.setName("index");
        testMapper.insert(test);
    }


}
