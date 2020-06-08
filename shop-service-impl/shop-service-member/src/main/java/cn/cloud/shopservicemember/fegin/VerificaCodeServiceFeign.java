package cn.cloud.shopservicemember.fegin;

import cn.cloud.shopserviceapiwixin.service.VerificaCodeService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("app-service-weixin")
public interface VerificaCodeServiceFeign extends VerificaCodeService {

}
