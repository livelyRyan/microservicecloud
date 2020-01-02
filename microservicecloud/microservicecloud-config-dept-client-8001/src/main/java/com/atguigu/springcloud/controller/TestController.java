/**
 * 
 */
/**
 * @author User
 *
 */
package com.atguigu.springcloud.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 使用该注解的类,会增加/refresh接口,调用该接口会重新获取配置并更新
public class TestController{
	
}