package com.ecnu.dao.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by admin on 2017/7/10.
 */
@Mapper
public interface ProductMapper {
    Product select(@Param("id")long id);
    void update(Product product);
}
