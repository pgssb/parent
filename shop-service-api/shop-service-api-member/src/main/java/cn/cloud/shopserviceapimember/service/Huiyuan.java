package cn.cloud.shopserviceapimember.service;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: shop-parent
 * <p>
 * 胖哥
 * @description:
 * @author: yueLi
 * @create: 2020-05-16 17:03
 **/

@Api(tags = "胖哥傻逼")
public interface Huiyuan {
    @GetMapping("hy")
    String getFingg();
}
