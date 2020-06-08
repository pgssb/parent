package cn.cloud.shopserviceapiwixin.service;


import entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
@Api(tags = "微信测试接口2")
public interface AppService {

    @GetMapping("getApp")
    @ApiOperation(value = "测试2")
    public AppEntity getApp();
}
