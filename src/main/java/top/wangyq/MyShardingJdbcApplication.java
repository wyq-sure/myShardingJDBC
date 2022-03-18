package top.wangyq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangyongqiang
 */
@SpringBootApplication
@MapperScan(basePackages = "top.wangyq.mapper")
public class MyShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShardingJdbcApplication.class, args);
    }

}
