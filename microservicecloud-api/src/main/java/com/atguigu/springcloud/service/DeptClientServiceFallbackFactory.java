package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/23 10:00 上午
 * <p>
 * 熔断器服务降级工厂
 */
//记得添加注解@Component，否则无效！
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Long id) {
                Dept dept = new Dept();
                dept.setDeptno(id)
                        .setDname("查找不到id:" + id + "的部门信息，此刻服务已经关闭")
                        .setDb_source("no this database in MySQL");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return new ArrayList<>();
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}