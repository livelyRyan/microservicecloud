package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController
{
	
	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
	
//	@Autowired
//	private DeptService service = null;

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	//一旦调用该接口失败（如抛出异常）频率超过阈值，会自动开启熔断。服务熔断后，新来的请求将通过fallbackMethod方法去处理
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id)
	{

//		Dept dept = this.service.get(id);
		
//		if (null == dept) {
			throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
//		}
		
//		return dept;
	}

	public Dept processHystrix_Get(@PathVariable("id") Long id)
	{
		return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
				.setDb_source("no this database in MySQL");
	}
}