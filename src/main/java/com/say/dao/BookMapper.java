package com.say.dao;

import com.say.pojo.Bbooks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
//    增加一本书
    int addBooks(Bbooks bbooks);
//    删除一本书
    int delBooks(@Param("bookID") int id);
//    更新一本书
    int updateBooks(Bbooks bbooks);
//    查询一本书
    Bbooks queryBookById(@Param("bookID") int id);
//    查询所有书
    List<Bbooks> queryAllBook();
//    查询书籍
    Bbooks queryBookName(@Param("BookName")String BookName);
}
