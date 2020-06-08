package cn.cloud.shopservicemember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Configuration
@MapperScan(basePackages = "cn.cloud.shopservicemember.mapper")
@EnableSwagger2
public class ShopServiceMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopServiceMemberApplication.class,args);
    }
}
