package com.atguigu.springcloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;

@RestController
public class DeptController {

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return new Dept().setDname("test-8001").setDeptno(id).setDb_source("test");
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		List<Dept> lst = new ArrayList<Dept>();
		for (int i = 0; i < 5; i++) {
			lst.add(new Dept().setDeptno((long) i).setDb_source("test").setDname("test-" + i));
		}

		return lst;
	}

}
