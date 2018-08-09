package izhbg.cloud.demo.service;


import izhbg.cloud.demo.service.entity.AtrributeParames;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: xiaolongcai2@creditease.cn
 * @Date: 2018/8/3 16:26
 * @Description:
 */
@FeignClient(name= "demo-rpc-service" )
public interface DemoRpcService {
    @RequestMapping("/demo/testMethod")
    String testMethod(@RequestParam( value = "param",required = true)String param, @RequestBody AtrributeParames atrributeParames);
}
