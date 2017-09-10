package com.thymeleaf.library.mybatis;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookInfo record);

    BookInfo selectByPrimaryKey(Integer id);

    List<BookInfo> selectAll();

    int updateByPrimaryKey(BookInfo record);
}