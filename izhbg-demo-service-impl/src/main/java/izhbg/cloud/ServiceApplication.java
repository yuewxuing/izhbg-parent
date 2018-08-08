package izhbg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//-- provider and consumer  service
@EnableEurekaClient
@ComponentScan("izhbg.cloud.demo")
public class ServiceApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run( ServiceApplication.class, args );
    }
}
