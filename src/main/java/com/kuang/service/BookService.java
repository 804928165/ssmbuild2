package com.kuang.service;

import com.kuang.pojo.Books;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //修改一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询所有书
    List<Books> queryAllBook();
    //用名字查询一本书
    List<Books> queryBookByName(String name);

    int updateBookCount(int bookid, int bookcount);
}
