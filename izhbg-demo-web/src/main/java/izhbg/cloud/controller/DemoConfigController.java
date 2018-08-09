package izhbg.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xiaolongcai2@creditease.cn
 * @Date: 2018/8/8 18:26
 * @Description:
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class DemoConfigController {
    @Value("${logging.path}")
    private String val;
    @RequestMapping(value="/callDemoConfig")
    public String callDemoConfig(){
        return val;
    }
}
