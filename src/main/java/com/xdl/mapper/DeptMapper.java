package com.xdl.mapper;

import com.xdl.bean.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptMapper {
    public Dept findById(int id);
    public List<Dept> findAll();
    public List<Dept> findByDName(String dname);

}
