package com.jerrykcode.springcloud.controller;

//import com.jerrykcode.springcloud.feign.DeptProvider;
import lombok.extern.slf4j.Slf4j;
import org.jerrykcode.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Slf4j
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    //@Autowired
    //private DeptProvider deptProvider;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/dept/new")
    public Boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
        //return deptProvider.addDept(dept);
    }

    @RequestMapping("/consumer/dept/query/{deptno}")
    public Dept query(@PathVariable("deptno") Long deptno) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/query/"+deptno, Dept.class);
        //return deptProvider.query(deptno);
    }

    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        log.info("CONSUMER list");
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/query-all", List.class);
        //return deptProvider.queryAll();
    }
}











