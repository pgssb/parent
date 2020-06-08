package cn.cloud.shopserviceapimember.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import cn.cloud.shopserviceapimember.service.MeMberConfigurur;

public class MeMberConfig implements MeMberConfigurur {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //解决swagger-ui.html404报错
        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

        //解决doc.html 404报错
        registry.addResourceHandler("/doc.html").addResourceLocations("classpath:/META-INF/resources/");
    }
}
