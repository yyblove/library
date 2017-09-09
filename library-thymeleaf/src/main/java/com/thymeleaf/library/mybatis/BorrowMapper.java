package com.thymeleaf.library.mybatis;

import com.thymeleaf.library.mybatis.Borrow;
import java.util.List;

public interface BorrowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Borrow record);

    Borrow selectByPrimaryKey(Integer id);

    List<Borrow> selectAll();

    int updateByPrimaryKey(Borrow record);
}