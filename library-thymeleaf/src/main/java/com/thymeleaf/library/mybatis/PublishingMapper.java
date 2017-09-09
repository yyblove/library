package com.thymeleaf.library.mybatis;

import com.thymeleaf.library.mybatis.Publishing;
import java.util.List;

public interface PublishingMapper {
    int insert(Publishing record);

    List<Publishing> selectAll();
}