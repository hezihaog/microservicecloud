package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/21 3:29 下午
 * <p>
 * 部门表Service层接口
 */
public interface DeptService {
    /**
     * 增加部门
     */
    boolean add(Dept dept);

    /**
     * 按部门Id查找部门信息
     */
    Dept get(Long id);

    /**
     * 查询所有部门
     */
    List<Dept> list();
}