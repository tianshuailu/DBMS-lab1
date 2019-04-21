package com.lts.service;

import java.util.List;
import com.lts.pojo.Book;

public interface BookService {

	List<Book> list();
	
	int add(Book book);
	
	int update(Book book);
	
	void delete(String b_id);
	
	Book search(String b_id);
}
