package cn.cloud.shopserviceweixin.impl;

import cn.cloud.shopcommoncore.base.api.BaseApiService;
import cn.cloud.shopcommoncore.base.entity.BaseResponse;
import cn.cloud.shopserviceapiwixin.service.WeiXinAppService;
import entity.AppEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeiXinAppServiceImpl extends BaseApiService<AppEntity> implements WeiXinAppService {
    /*@Value("${mayikt.weixin.name}")
    private String name;*/

    @Override
    public BaseResponse<AppEntity> getApp() {
        return setResultError("系统错误！");
    }
}
