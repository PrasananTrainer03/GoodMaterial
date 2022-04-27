package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@RibbonClient(name = "loadbalancer", configuration = RibbonConfiguration.class)
@EnableEurekaClient
@SpringBootApplication
public class SpringLoadBalancerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLoadBalancerExampleApplication.class, args);
	}

}
