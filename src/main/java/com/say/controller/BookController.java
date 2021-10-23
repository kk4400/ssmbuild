package com.say.controller;

import com.say.pojo.Bbooks;
import com.say.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired()
    @Qualifier("BookServiceImpl")
    private BookService bookService;

//    查询全部的书籍并返回到页面
    @RequestMapping("/allbook")
    public String list(Model model){
        List<Bbooks> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddPage(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Bbooks bbooks){
        bookService.addBooks(bbooks);
        return "redirect:/book/allbook";
    }
//   跳转到修改页面
    @RequestMapping("/toupdatepage/{id}")
    public String toupdatepage(@PathVariable int id,Model model){
        Bbooks bbooks = bookService.queryBookById(id);
        model.addAttribute("bbooks",bbooks);
        return "uodateBook";
    }

//    修改
    @RequestMapping("/toupdate")
    public String toupdate(Bbooks bbooks){
        int i = bookService.updateBooks(bbooks);

            return "redirect:/book/allbook";

    }

    @RequestMapping("/del/{id}")
    public String delBook(@PathVariable int id){
       bookService.delBooks(id);
        return"redirect:/book/allbook";
    }

//    查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String BookName,Model model){
        Bbooks bbooks = bookService.queryBookName(BookName);
        List<Bbooks> list=new ArrayList<>();
        list.add(bbooks);
        if(bbooks==null){
            list=bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "allBook";
    }
}
