package com.yxy.rest.dao;

import com.yxy.rest.module.Comment;
import com.yxy.rest.module.ProductEntity;
import com.yxy.rest.module.ProductImage;
import com.yxy.rest.module.ProductList;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Mybatis 的数据库操作
 * 我们不用去实现这个接口，Mybatis会为我们做
 */
//让Mybatis知道这是一个Mapper
@Mapper
//让Spring Boot能够扫描到这个类（接口），没有实际作用
@Repository
public interface ProductDao {
    //在这里写SQL
    @Select("SELECT product_id,product_name,product_price,product_img_url,product_uprice FROM product")
    List<ProductList> getProductList();

    @Select("select * from product where product_id=#{producId}")
    ProductEntity getProductDetailData(@Param("producId")Integer id);

    @Select("select * from product_image where product_id=#{producId}")
    List<ProductImage> getProductDetailImgs(@Param("producId")Integer id);

    //select * from product where category_id=#{catId}
    @Select("select * from product where category_id=#{catId}")
    List<ProductEntity> getCategoryGoods(@Param("catId")Integer id);
}
