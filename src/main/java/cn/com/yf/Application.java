package cn.com.yf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author fang.yang
 * @version V1.0
 * @date 2018/10/28 20:59
 * @ClassName:
 * @Description:
 */
@SpringBootApplication
@MapperScan("cn.com.yf.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
