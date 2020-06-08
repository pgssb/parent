package cn.cloud.shopserviceapiwixin.service;

import cn.cloud.shopcommoncore.base.entity.BaseResponse;
import entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "微信服务接口")
public interface WeiXinAppService {

    /**
     * 功能说明： 应用服务接口
     */
    @ApiOperation(value = "微信应用服务接口")
    @GetMapping("/getApp1")
    public BaseResponse<AppEntity> getApp();

}
