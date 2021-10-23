package com.say.service.Impl;

import com.say.dao.BookMapper;
import com.say.pojo.Bbooks;
import com.say.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServicImpl implements BookService {

    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBooks(Bbooks bbooks) {
        return bookMapper.addBooks(bbooks);
    }

    @Override
    public int delBooks(int id) {
        return bookMapper.delBooks(id);
    }

    @Override
    public int updateBooks(Bbooks bbooks) {
        return bookMapper.updateBooks(bbooks);
    }

    @Override
    public Bbooks queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Bbooks> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Bbooks queryBookName(String BookName) {
        return bookMapper.queryBookName(BookName);
    }
}
