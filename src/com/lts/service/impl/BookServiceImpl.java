package com.lts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lts.mapper.BookMapper;
import com.lts.pojo.Book;
import com.lts.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookMapper bookMapper;
	
	public List<Book> list() {
		return bookMapper.list();
	}
	
	public int add(Book book) {
		return bookMapper.add(book);
	}

	public int update(Book book) {
		return bookMapper.update(book);
	}

	public void delete(String b_id) {
		bookMapper.delete(b_id);
	}
	
	public Book search(String b_id) {
		return bookMapper.search(b_id);
	}
}
