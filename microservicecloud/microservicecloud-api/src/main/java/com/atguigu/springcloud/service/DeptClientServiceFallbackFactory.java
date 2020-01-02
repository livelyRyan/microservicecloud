package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component // 将bean注入到spring容器中
// 实现FallbackFactory接口，该类中实现服务降级后的接口处理类
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
	@Override
	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {
			@Override
			public Dept get(long id) {
				return new Dept().setDeptno(id).setDname("该ID：" + id + "没有对应的信息。消费者客户端提供的降级信息，此刻服务供应方已关闭")
						.setDb_source("no target database in MySQL");
			}

			@Override
			public List<Dept> list() { return null; }

			@Override
			public boolean add(Dept dept) { return false; }
		};
	}
}
