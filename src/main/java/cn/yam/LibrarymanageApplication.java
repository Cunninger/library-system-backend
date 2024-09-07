package cn.yam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@MapperScan("cn.yam.mapper")
@SpringBootApplication
public class LibrarymanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarymanageApplication.class, args);
    }

}
// int main()