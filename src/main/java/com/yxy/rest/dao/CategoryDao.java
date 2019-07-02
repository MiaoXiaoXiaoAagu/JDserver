package com.yxy.rest.dao;

import com.yxy.rest.module.CategoryName;
import com.yxy.rest.module.ProductEntity;
import com.yxy.rest.module.ProductImage;
import com.yxy.rest.module.ProductList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Mybatis 的数据库操作
 * 我们不用去实现这个接口，Mybatis会为我们做
 */
//让Mybatis知道这是一个Mapper
@Mapper
//让Spring Boot能够扫描到这个类（接口），没有实际作用
@Repository
public interface CategoryDao {
    //在这里写SQL
    @Select("SELECT * FROM category ORDER BY category_id desc")
    List<CategoryName> getCategoryList();

}
