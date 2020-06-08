package cn.cloud.shopserviceweixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @program: shop-parent
 * <p>
 * 胖哥
 * @description: 服务者
 * @author: yueLi
 * @create: 2020-04-02 11:37
 **/
@SpringBootApplication
@ComponentScan("cn.cloud")
@EnableEurekaClient
@EnableFeignClients
public class ShopServiceWeixinApplication {
    public static void main(String[] args) {
        SpringApplication. run(ShopServiceWeixinApplication.class,args);
    }
}