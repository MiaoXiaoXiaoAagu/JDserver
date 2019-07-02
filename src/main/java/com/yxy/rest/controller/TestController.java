package com.yxy.rest.controller;
import com.yxy.rest.module.CategoryId;
import com.yxy.rest.module.ProductId;
import com.yxy.rest.module.ProductImage;
import com.yxy.rest.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 声明接口路径，处理http请求
 */
@RestController
//@RequestMapping("/test") //外层路径
@CrossOrigin(origins = "*",maxAge = 3600)
public class TestController {

    //使用Autowired注解，自动获取对象，不用自己初始化
    @Autowired
    private TestService testService;

    /**
     * 处理Get请求
     * @return json对象
     */
    @GetMapping("/me") //内层路径，合起来就是/test/me
    public Object me() {
        //调用TestService处理业务，获取数据
        return testService.getAllComment();
    }
    @GetMapping("/home") //内层路径，合起来就是/test/me
    public Object home() {
        //调用TestService处理业务，获取数据
        return testService.getProductList();
    }

    /**
     * 处理Post请求
     * @return json对象
     */


    @PostMapping("/detail/data")
    @ResponseBody
    public Object detailData(@RequestBody ProductId id) {
        return testService.getProductDetailData( id.getProducId());
    }

    @PostMapping("/detail/imgs")
    @ResponseBody
    public Object detailImgs(@RequestBody ProductId id) {
       Object imgs=testService.getProductDetailImgs( id.getProducId());
        return imgs;
    }

    @GetMapping("/category/list")
    public Object getCategoryList() {
        Object categoryNames=testService.getCategoryList();
        return categoryNames;
    }

    @PostMapping("/category/goods")
    @ResponseBody
    public Object getCategoryGoods(@RequestBody CategoryId id) {
        Object categoryGoods=testService.getCategoryGoods( id.getCategory_id());
        return categoryGoods;
    }
}
