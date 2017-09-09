package com.thymeleaf.library.mybatis;

import com.thymeleaf.library.mybatis.Purview;
import java.util.List;

public interface PurviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Purview record);

    Purview selectByPrimaryKey(Integer id);

    List<Purview> selectAll();

    int updateByPrimaryKey(Purview record);
}