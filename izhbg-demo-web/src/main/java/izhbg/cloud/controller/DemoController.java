package izhbg.cloud.controller;

import izhbg.cloud.demo.service.DemoRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xiaolongcai2@creditease.cn
 * @Date: 2018/8/7 10:27
 * @Description:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

  @Autowired
  private DemoRpcService demoRpcService;

  @RequestMapping(value="/testMethod")
  public String testMethod(){
      return demoRpcService.testMethod("hello word!!!");
  }

}
