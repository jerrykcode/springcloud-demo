package org.jerrykcode.springcloud.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Dept implements Serializable { //Dept实体类 orm类表关系映射
    private Long deptno; //主键
    private String deptname;
    private String dbSource;
}
