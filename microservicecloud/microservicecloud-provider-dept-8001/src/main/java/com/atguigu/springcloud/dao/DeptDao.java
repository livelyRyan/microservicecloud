package com.atguigu.springcloud.dao;

import java.util.List;

import com.atguigu.springcloud.entities.Dept;

//@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
