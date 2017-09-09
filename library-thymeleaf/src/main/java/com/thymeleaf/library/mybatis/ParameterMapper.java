package com.thymeleaf.library.mybatis;

import com.thymeleaf.library.mybatis.Parameter;
import java.util.List;

public interface ParameterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Parameter record);

    Parameter selectByPrimaryKey(Integer id);

    List<Parameter> selectAll();

    int updateByPrimaryKey(Parameter record);
}