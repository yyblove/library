package com.thymeleaf.library.mybatis;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LibraryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Library record);

    Library selectByPrimaryKey(Integer id);

    List<Library> selectAll();

    int updateByPrimaryKey(Library record);
}