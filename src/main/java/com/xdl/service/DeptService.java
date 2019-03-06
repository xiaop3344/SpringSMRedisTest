package com.xdl.service;

import com.xdl.bean.Dept;
import com.xdl.mapper.DeptMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@MapperScan(basePackages = {"com.xdl.mapper"})
public class DeptService {

    @Autowired
    private DeptMapper mapper;

    @Autowired
    private RedisTemplate redisTemplate;

    public Dept findById(int id){
        Dept dept = mapper.findById(id);

        redisTemplate.opsForValue().set("dept:"+id,dept);

        return dept;

    }
    public List<Dept> findAll(){

        List<Dept> depts = mapper.findAll();
        return depts;


    }

    public List<Dept> findByDName(String dname){
        List<Dept> depts = mapper.findByDName(dname);
        return depts;


    }




}
