package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient 包含EnableDiscoveryClient，该注解在euraka包下.当注册中心是eureka时,使用EnableEurekaClient.
// 当注册中心是其他的,如zk,consul时,使用EnableDiscoveryClient.EnableDiscoveryClient是spring-cloud-commons包下的
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient //服务发现
public class DeptProvider8001_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
