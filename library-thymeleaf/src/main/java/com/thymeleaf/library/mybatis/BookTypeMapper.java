package com.thymeleaf.library.mybatis;

import com.thymeleaf.library.mybatis.BookType;
import java.util.List;

public interface BookTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookType record);

    BookType selectByPrimaryKey(Integer id);

    List<BookType> selectAll();

    int updateByPrimaryKey(BookType record);
}