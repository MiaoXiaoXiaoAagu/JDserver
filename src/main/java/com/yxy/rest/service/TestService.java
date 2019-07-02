package com.yxy.rest.service;

/**
 * 业务在这里处理
 */
public interface TestService {
    /**
     * 获取全部评论
     * @return Object对象
     */
    //其实可以是任意对象，计算哦你序列化会在Controller中方法返回后自己序列化
    Object getAllComment();
    Object getProductList();
    Object getProductDetailData(Integer producId);
    Object getProductDetailImgs(Integer producId);
    Object getCategoryList();
    Object getCategoryGoods(Integer catId);//categorygoods
}
