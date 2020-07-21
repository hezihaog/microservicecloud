package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/21 3:48 下午
 * <p>
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    /**
     * 增加部门
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    /**
     * 按部门Id查找部门信息
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    /**
     * 查询所有部门
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }
}