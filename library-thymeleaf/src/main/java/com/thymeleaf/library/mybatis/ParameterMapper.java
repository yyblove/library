package com.thymeleaf.library.mybatis;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ParameterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Parameter record);

    Parameter selectByPrimaryKey(Integer id);

    List<Parameter> selectAll();

    int updateByPrimaryKey(Parameter record);
}