package cn.cloud.shopserviceapimember.service;

import cn.cloud.shopcommoncore.base.entity.BaseResponse;
import com.alibaba.fastjson.JSONObject;
import entity.UserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Api(tags = "会员注册接口")
public interface MemberRegisterService {
	/**
	 * 用户注册接口
	 * 
	 * @param userEntity
	 * @return
	 */
	@PostMapping("/register")
	@ApiOperation(value = "会员用户注册信息接口")
	@ApiImplicitParams({
			/*@ApiImplicitParam(paramType = "body", name = "userEntity", dataType = "UserEntity", required = true, value = "用户信息"),*/
			@ApiImplicitParam(paramType = "query", name = "registCode", dataType = "String", required = true, value = "微信注册码") })
	BaseResponse<JSONObject> register(@RequestBody UserEntity userEntity,
									  @RequestParam("registCode") String registCode);
}