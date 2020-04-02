package cn.cloud.shopserviceweixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: shop-parent
 * <p>
 * 胖哥
 * @description: 服务者
 * @author: yueLi
 * @create: 2020-04-02 11:37
 **/
@SpringBootApplication
@EnableEurekaClient
public class ShopServiceWeixinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopServiceWeixinApplication.class,args);
    }
}
