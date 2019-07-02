package com.yxy.rest.module;

import java.math.BigDecimal;

public class CategoryName {
    //SELECT product_id,product_name,product_price,product_img_url,product_uprice FROM product
    private int category_id;
    private String category_name;
    private String content;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
