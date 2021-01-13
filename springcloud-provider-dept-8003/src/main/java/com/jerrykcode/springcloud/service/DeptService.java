package com.jerrykcode.springcloud.service;

import org.jerrykcode.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(Long deptno);

    List<Dept> queryAll();
}
