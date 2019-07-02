package com.yxy.rest.service.impl;

import com.yxy.rest.dao.CategoryDao;
import com.yxy.rest.dao.ProductDao;
import com.yxy.rest.dao.TestDao;
import com.yxy.rest.module.*;
import com.yxy.rest.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TestService 的真正实现
 */
//Service注解没有实际作用，只是让Spring Boot可以扫描到这个类（Spring原理就不讲了）
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Object getAllComment() {
        List<Comment> comments = testDao.getAll();
        return comments;
    }
    @Override
    public Object getProductList(){
        List<ProductList> productList = productDao.getProductList();
        return productList;
    };//home页面

    @Override
    public Object getProductDetailData(Integer producId){
        ProductEntity productDetail = productDao.getProductDetailData(producId);
        System.out.println(producId);
        System.out.println(productDetail);
        return productDetail;
    };//detail/detail
    @Override
    public Object getProductDetailImgs(Integer producId){
        List<ProductImage> productImages = productDao.getProductDetailImgs(producId);
        return productImages;
    };//detail/imgs

    @Override
    public Object getCategoryList(){
        List<CategoryName> categoryList=categoryDao.getCategoryList();
        return categoryList;
    };//category/list
//    Object getCategoryGoods();//categorygoods
    @Override
    public Object getCategoryGoods(Integer catId){
        List<ProductEntity> categoryGoods=productDao.getCategoryGoods(catId);
        return categoryGoods;
    };
}
