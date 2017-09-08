package com.cz.library.mybatis;

import java.util.List;

public interface TestMapper {
    int insert(Test record);

    List<Test> selectAll();
}