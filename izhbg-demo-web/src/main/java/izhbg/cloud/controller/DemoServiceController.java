package izhbg.cloud.controller;

import izhbg.cloud.demo.service.DemoRpcService;
import izhbg.cloud.demo.service.entity.AtrributeParames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: xiaolongcai2@creditease.cn
 * @Date: 2018/8/7 10:27
 * @Description:
 */
@RestController
@RequestMapping("/demo")
public class DemoServiceController {

  @Autowired
  private DemoRpcService demoRpcService;

  @RequestMapping(value="/callTestMethod")
  public String callTestMethod(){
    AtrributeParames atrributeParames = new AtrributeParames();
    atrributeParames.setAge(1);
    List<String> loves = new ArrayList<>();
    loves.add("猫");
    loves.add("狗");
    atrributeParames.setLoves(loves);
    atrributeParames.setId("123456");
    atrributeParames.setName("test");
    return demoRpcService.testMethod("hello word!!!",atrributeParames);
  }

}
