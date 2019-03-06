package com.xdl.controller;

import com.xdl.bean.Dept;
import com.xdl.mapper.DeptMapper;
import com.xdl.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @GetMapping("/dept/{id}")
    public Dept findById(@PathVariable int id){
        Dept dept = service.findById(id);
        return dept;
    }
    @GetMapping("/dept.do")
    public List<Dept> findAll(){
        List<Dept> depts = service.findAll();
        return depts;
    }
    @GetMapping("/deptname/{dname}")
    public List<Dept> findByDName(@PathVariable String dname){
        List<Dept> depts = service.findByDName(dname);
        return depts;

    }


}
