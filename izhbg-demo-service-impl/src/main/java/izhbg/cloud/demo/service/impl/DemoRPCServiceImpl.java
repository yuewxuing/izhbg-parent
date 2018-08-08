package izhbg.cloud.demo.service.impl;

import izhbg.cloud.demo.service.DemoRpcService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xiaolongcai2@creditease.cn
 * @Date: 2018/8/3 16:29
 * @Description:
 */
@RestController
public class DemoRPCServiceImpl implements DemoRpcService {

    @Override
    public String testMethod(String param) {
        System.out.println(">>>> param = "+param );
        return "testMethod"+param;
    }

}
