package com.thymeleaf.library.mybatis;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Manager record);

    Manager selectByPrimaryKey(Integer id);

    List<Manager> selectAll();

    int updateByPrimaryKey(Manager record);
}