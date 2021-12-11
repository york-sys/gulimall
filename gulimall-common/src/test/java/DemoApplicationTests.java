import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

/**
 * @author gmd on 2021/12/5
 * @since 1.0.0
 */

public class DemoApplicationTests {
    @Test
    public void Test1(){
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println(version);
        System.out.println(version1);
    }

}
