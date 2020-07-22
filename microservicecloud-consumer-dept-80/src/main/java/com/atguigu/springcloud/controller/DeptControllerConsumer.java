package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author hezihao
 * @version 1.0
 * <p>
 * @date 2020/7/21 6:22 下午
 * <p>
 */
@RestController
public class DeptControllerConsumer {
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 增加一个部门
     */
    @RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept) {
        String url = REST_URL_PREFIX + "/dept/add";
        //第一个参数：Url地址，第二个参数：请求参数，第三个参数，响应的返回值的Class
        return restTemplate.postForObject(url, dept, Boolean.class);
    }

    /**
     * 按Id查询部门信息
     */
    @RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        String url = REST_URL_PREFIX + "/dept/get/" + id;
        return restTemplate.getForObject(url, Dept.class);
    }

    /**
     * 查询所有部门
     */
    @RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        String url = REST_URL_PREFIX + "/dept/list";
        return restTemplate.getForObject(url, List.class);
    }

    /**
     * 测试服务发现
     */
    @RequestMapping(value = "/consumer/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        String url = REST_URL_PREFIX + "/dept/discovery";
        return restTemplate.getForObject(url, Object.class);
    }
}