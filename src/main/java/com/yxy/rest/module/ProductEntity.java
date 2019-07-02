package com.yxy.rest.module;

import java.math.BigDecimal;



public class ProductEntity {
    private int product_id;
    private Integer category_id;
    private Integer shop_id;
    private String product_name;
    private BigDecimal product_price;
    private String product_img_url;
    private BigDecimal product_uprice;
    private String product_num;
    private String product_detail;
    private Integer product_comment_num;
    private Integer product_hot;
    private Integer product_special;
    private Integer product_search_hot;


    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }


    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }


    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }


    public BigDecimal getProduct_price() {
        return product_price;
    }

    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }

    public String getProduct_img_url() {
        return product_img_url;
    }

    public void setProduct_img_url(String product_img_url) {
        this.product_img_url = product_img_url;
    }


    public BigDecimal getProduct_uprice() {
        return product_uprice;
    }

    public void setProduct_uprice(BigDecimal product_uprice) {
        this.product_uprice = product_uprice;
    }

    public String getProduct_num() {
        return product_num;
    }

    public void setProduct_num(String product_num) {
        this.product_num = product_num;
    }


    public String getProduct_detail() {
        return product_detail;
    }

    public void setProduct_detail(String product_detail) {
        this.product_detail = product_detail;
    }


    public Integer getProduct_comment_num() {
        return product_comment_num;
    }

    public void setProduct_comment_num(Integer product_comment_num) {
        this.product_comment_num = product_comment_num;
    }


    public Integer getProduct_hot() {
        return product_hot;
    }

    public void setProduct_hot(Integer product_hot) {
        this.product_hot = product_hot;
    }


    public Integer getProduct_special() {
        return product_special;
    }

    public void setProduct_special(Integer product_special) {
        this.product_special = product_special;
    }


    public Integer getProduct_search_hot() {
        return product_search_hot;
    }

    public void setProduct_search_hot(Integer product_search_hot) {
        this.product_search_hot = product_search_hot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (product_id != that.product_id) return false;
        if (category_id != null ? !category_id.equals(that.category_id) : that.category_id != null) return false;
        if (shop_id != null ? !shop_id.equals(that.shop_id) : that.shop_id != null) return false;
        if (product_name != null ? !product_name.equals(that.product_name) : that.product_name != null) return false;
        if (product_price != null ? !product_price.equals(that.product_price) : that.product_price != null) return false;
        if (product_img_url != null ? !product_img_url.equals(that.product_img_url) : that.product_img_url != null)
            return false;
        if (product_uprice != null ? !product_uprice.equals(that.product_uprice) : that.product_uprice != null)
            return false;
        if (product_num != null ? !product_num.equals(that.product_num) : that.product_num != null) return false;
        if (product_detail != null ? !product_detail.equals(that.product_detail) : that.product_detail != null)
            return false;
        if (product_comment_num != null ? !product_comment_num.equals(that.product_comment_num) : that.product_comment_num != null)
            return false;
        if (product_hot != null ? !product_hot.equals(that.product_hot) : that.product_hot != null) return false;
        if (product_special != null ? !product_special.equals(that.product_special) : that.product_special != null)
            return false;
        if (product_search_hot != null ? !product_search_hot.equals(that.product_search_hot) : that.product_search_hot != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = product_id;
        result = 31 * result + (category_id != null ? category_id.hashCode() : 0);
        result = 31 * result + (shop_id != null ? shop_id.hashCode() : 0);
        result = 31 * result + (product_name != null ? product_name.hashCode() : 0);
        result = 31 * result + (product_price != null ? product_price.hashCode() : 0);
        result = 31 * result + (product_img_url != null ? product_img_url.hashCode() : 0);
        result = 31 * result + (product_uprice != null ? product_uprice.hashCode() : 0);
        result = 31 * result + (product_num != null ? product_num.hashCode() : 0);
        result = 31 * result + (product_detail != null ? product_detail.hashCode() : 0);
        result = 31 * result + (product_comment_num != null ? product_comment_num.hashCode() : 0);
        result = 31 * result + (product_hot != null ? product_hot.hashCode() : 0);
        result = 31 * result + (product_special != null ? product_special.hashCode() : 0);
        result = 31 * result + (product_search_hot != null ? product_search_hot.hashCode() : 0);
        return result;
    }
}
