package cn.cloud.shopserviceapiwixin.service;


import entity.Wx;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
@Api(tags = "微信测试接口1")
public interface WeiXin {

     @GetMapping("/wx")
     @ApiOperation(value = "测试1")
     Wx getAll();
}
