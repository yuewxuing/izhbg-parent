package izhbg.cloud.demo.service.impl;

import com.alibaba.fastjson.JSON;
import izhbg.cloud.demo.service.DemoRpcService;
import izhbg.cloud.demo.service.entity.AtrributeParames;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xiaolongcai2@creditease.cn
 * @Date: 2018/8/3 16:29
 * @Description:
 */
@RestController
public class DemoRPCServiceImpl implements DemoRpcService {

    @Override
    public String testMethod(@RequestParam String param, @RequestBody AtrributeParames atrributeParames) {
        System.out.println(">>>> param = "+param );
        System.out.println(">>> attribute="+JSON.toJSONString(atrributeParames));
        return "testMethod"+param;
    }

}
