package org.jerrykcode.springcloud.service;

import org.jerrykcode.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value="SPRINGCLOUD-PROVIDER-DEPT")
public interface DeptClientService {
    @PostMapping("/dept/add")
    boolean addDept(Dept dept) ;

    @GetMapping("/dept/query/{deptno}")
    Dept query(@PathVariable("deptno") Long deptno) ;

    @GetMapping("/dept/query-all")
    List<Dept> queryAll() ;
}
