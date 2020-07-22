package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/21 3:15 下午
 * <p>
 * 部门表Dao层接口
 */
@Repository
@Mapper
public interface DeptDao {
    /**
     * 增加部门
     */
    boolean addDept(Dept dept);

    /**
     * 按部门Id查找部门信息
     */
    Dept findById(Long id);

    /**
     * 查询所有部门
     */
    List<Dept> findAll();
}