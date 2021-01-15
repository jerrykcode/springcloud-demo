package org.jerrykcode.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.jerrykcode.springcloud.pojo.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept query(Long deptno) {
                return new Dept().setDeptno(deptno)
                        .setDeptname("服务降级")
                        .setDbSource("没有数据");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
