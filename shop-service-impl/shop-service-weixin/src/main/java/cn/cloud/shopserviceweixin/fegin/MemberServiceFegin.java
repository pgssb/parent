package cn.cloud.shopserviceweixin.fegin;

import cn.cloud.shopserviceapimember.service.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("app-service-member")
public interface MemberServiceFegin extends MemberService {
}
