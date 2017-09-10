package com.thymeleaf.library.mybatis;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookcaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bookcase record);

    Bookcase selectByPrimaryKey(Integer id);

    List<Bookcase> selectAll();

    int updateByPrimaryKey(Bookcase record);
}