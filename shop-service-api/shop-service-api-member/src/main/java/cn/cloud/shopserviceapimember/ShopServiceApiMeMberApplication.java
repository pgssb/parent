package cn.cloud.shopserviceapimember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ShopServiceApiMeMberApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopServiceApiMeMberApplication.class,args);
    }
}
