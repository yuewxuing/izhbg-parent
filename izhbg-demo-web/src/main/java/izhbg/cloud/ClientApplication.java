package izhbg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@SpringBootApplication
//-- consumer  http://blog.didispace.com/spring-cloud-tips-feign-rpc/
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"izhbg.cloud.demo"})
@RestController
@ComponentScan("izhbg.cloud")
public class ClientApplication
{
    public static void main( String[] args )
    {
        SpringApplication springApplication=new SpringApplication(ClientApplication.class);
        ConfigurableApplicationContext applicationContext=springApplication.run(args);
    }
}
