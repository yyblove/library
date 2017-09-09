package com.thymeleaf.library.dao;

import com.thymeleaf.library.mybatis.BookInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookInfoDaoImpl implements BookInfoDao{

    @Autowired
    BookInfoMapper bookInfoMapper;


}
