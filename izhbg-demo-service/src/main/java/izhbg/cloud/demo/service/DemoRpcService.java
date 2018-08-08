package izhbg.cloud.demo.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: xiaolongcai2@creditease.cn
 * @Date: 2018/8/3 16:26
 * @Description:
 */
@FeignClient(name= "demo-rpc-service" )
public interface DemoRpcService {
    @RequestMapping("/demo/testMethod")
    String testMethod(String param);
}
