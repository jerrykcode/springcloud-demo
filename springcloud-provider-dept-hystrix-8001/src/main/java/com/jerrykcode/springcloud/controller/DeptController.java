package com.jerrykcode.springcloud.controller;

import com.jerrykcode.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.jerrykcode.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/query/{id}")
    @HystrixCommand(fallbackMethod = "hystrixQuery")
    public Dept query(@PathVariable("id")Long id) {
        Dept dept = deptService.queryById(id);
        if (dept == null) {
            throw new RuntimeException("id \'"+id+"\' do not exist!");
        }
        return dept;
    }

    public Dept hystrixQuery(Long id) {
        return new Dept().setDeptno(id)
                .setDeptname("id \'"+id+"\' do not exist!")
                .setDbSource("No database");
    }
}
