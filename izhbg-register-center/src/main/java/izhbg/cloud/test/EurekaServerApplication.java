package izhbg.cloud.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication
{
    public static void main(String[] args) {
        SpringApplication.run( EurekaServerApplication.class, args );
    }

}
