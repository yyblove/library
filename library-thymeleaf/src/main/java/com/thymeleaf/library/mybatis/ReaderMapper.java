package com.thymeleaf.library.mybatis;

import com.thymeleaf.library.mybatis.Reader;
import java.util.List;

public interface ReaderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reader record);

    Reader selectByPrimaryKey(Integer id);

    List<Reader> selectAll();

    int updateByPrimaryKey(Reader record);
}