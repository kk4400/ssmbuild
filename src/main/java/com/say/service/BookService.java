package com.say.service;

import com.say.pojo.Bbooks;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //    增加一本书
    int addBooks(Bbooks books);
    //    删除一本书
    int delBooks(int id);
    //    更新一本书
    int updateBooks(Bbooks books);
    //    查询一本书
    Bbooks queryBookById(int id);
    //    查询所有书
    List<Bbooks> queryAllBook();
    //    查询书籍
    Bbooks queryBookName(String BookName);
}
