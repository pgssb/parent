package cn.cloud.shopserviceapiwixin.config;

import cn.cloud.shopserviceapiwixin.service.WeiXinConfigurur;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

public class WeiXinConfig implements WeiXinConfigurur {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-hi.html").addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
    }
}
