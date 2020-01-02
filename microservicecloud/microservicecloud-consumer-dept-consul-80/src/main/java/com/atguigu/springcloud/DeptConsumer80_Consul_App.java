package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name="microservicecloud-dept-consul")
public class DeptConsumer80_Consul_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80_Consul_App.class, args);
	}
}
