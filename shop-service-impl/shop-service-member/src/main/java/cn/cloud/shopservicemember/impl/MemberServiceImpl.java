package cn.cloud.shopservicemember.impl;

import cn.cloud.shopcommoncore.base.api.BaseApiService;
import cn.cloud.shopcommoncore.base.entity.BaseResponse;
import cn.cloud.shopserviceapimember.service.MemberService;
import cn.cloud.shopcommoncore.constants.Constants;
import cn.cloud.shopservicemember.mapper.UserMapper;
import entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl extends BaseApiService<UserEntity> implements MemberService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public BaseResponse<UserEntity> existMobile(String mobile) {
		// 1.验证参数
		if (StringUtils.isEmpty(mobile)) {
			return setResultError("手机号码不能为空!");
		}
		UserEntity userEntity = userMapper.existMobile(mobile);
		if (userEntity == null) {
			return setResultError(Constants.HTTP_RES_CODE_EXISTMOBILE_202, "用户不存在");
		}
		// 注意需要将敏感数据进行脱敏
		userEntity.setPassword(null);
		return setResultSuccess(userEntity);
	}

}