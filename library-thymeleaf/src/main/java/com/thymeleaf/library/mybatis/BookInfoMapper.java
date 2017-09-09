package com.thymeleaf.library.mybatis;

import com.thymeleaf.library.mybatis.BookInfo;
import java.util.List;

public interface BookInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookInfo record);

    BookInfo selectByPrimaryKey(Integer id);

    List<BookInfo> selectAll();

    int updateByPrimaryKey(BookInfo record);
}