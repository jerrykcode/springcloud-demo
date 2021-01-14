package com.jerrykcode.springcloud.controller;

//import com.jerrykcode.springcloud.feign.DeptProvider;
import lombok.extern.slf4j.Slf4j;
import org.jerrykcode.springcloud.pojo.Dept;
import org.jerrykcode.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/consumer/dept/new")
    public Boolean add(Dept dept) {
       return deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/query/{deptno}")
    public Dept query(@PathVariable("deptno") Long deptno) {
        return deptClientService.query(deptno);
    }

    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptClientService.queryAll();
    }
}











