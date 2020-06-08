package cn.cloud.shopservicemember.fegin;

import entity.Wx;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: shop-parent
 * <p>
 * 胖哥
 * @description:
 * @author: yueLi
 * @create: 2020-05-16 19:33
 **/
@FeignClient("app-service-weixin")
public interface WxFegin {

    @GetMapping("/wx")
    Wx getAll();
}
