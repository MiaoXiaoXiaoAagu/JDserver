package com.yxy.rest.dao;

import com.yxy.rest.module.Comment;
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
public interface TestDao {
    //在这里写SQL
    @Select("select * from comment")
    List<Comment> getAll();

    @Insert("insert into comment(detail, email, articleId, name, createtime) " +
            "value(#{detail}, #{email}, #{articleId}, #{name}, #{date})")
    Integer insertCommnet(@Param("detail")String detail,
                          @Param("email")String email,
                          @Param("articleId")Integer id,
                          @Param("name")String name,
                          @Param("date")Date date);

    @Update("update comment set isRead=#{read} where id=#{id}")
    Integer setReadById(@Param("read")Boolean read, @Param("id")Integer id);

    @Delete("delete from comment where id=#{id}")
    Integer deleteById(@Param("id")Integer id);
}
