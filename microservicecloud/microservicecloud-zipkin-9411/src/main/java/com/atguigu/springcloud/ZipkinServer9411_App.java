package com.atguigu.springcloud;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
 
import zipkin.server.EnableZipkinServer;
 
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer // 开启zipkin服务
public class ZipkinServer9411_App
{
   public static void main(String[] args)
   {
       SpringApplication.run(ZipkinServer9411_App.class, args);
   }
}
 
