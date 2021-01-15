package com.jerrykcode.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.jerrykcode.springcloud.pojo.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    boolean addDept(@Param("dept") Dept dept);

    Dept queryById(@Param("deptno") Long deptno);

    List<Dept> queryAll();
}
