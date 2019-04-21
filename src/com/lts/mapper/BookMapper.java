package com.lts.mapper;

import java.util.List;
import com.lts.pojo.Book;

public interface BookMapper {

	public List<Book> list();
	
	public int add(Book book);
	
	public int update(Book book);
	
	public void delete(String b_id);
	
	public Book search(String b_id);
	
}
