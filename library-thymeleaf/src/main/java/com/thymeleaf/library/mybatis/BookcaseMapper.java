package com.thymeleaf.library.mybatis;

import com.thymeleaf.library.mybatis.Bookcase;
import java.util.List;

public interface BookcaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bookcase record);

    Bookcase selectByPrimaryKey(Integer id);

    List<Bookcase> selectAll();

    int updateByPrimaryKey(Bookcase record);
}