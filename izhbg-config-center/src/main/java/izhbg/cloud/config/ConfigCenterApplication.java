package izhbg.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.ConfigServerApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigCenterApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
