package com.thymeleaf.library.mybatis;

import com.thymeleaf.library.mybatis.ReaderType;
import java.util.List;

public interface ReaderTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReaderType record);

    ReaderType selectByPrimaryKey(Integer id);

    List<ReaderType> selectAll();

    int updateByPrimaryKey(ReaderType record);
}