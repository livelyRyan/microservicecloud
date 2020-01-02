package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //服务发现
public class DeptProvider8001_Consul_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8001_Consul_App.class, args);
	}
}
