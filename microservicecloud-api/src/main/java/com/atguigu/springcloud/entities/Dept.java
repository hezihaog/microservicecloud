package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/21 2:15 下午
 * <p>
 * 部门表实体
 */
@NoArgsConstructor
@Data
//访问，链式访问
@Accessors(chain = true)
public class Dept implements Serializable {
    /**
     * 主键
     */
    private Long deptno;
    /**
     * 部门名臣
     */
    private String dname;
    /**
     * 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同的数据库
     */
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}