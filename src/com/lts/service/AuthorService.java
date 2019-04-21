package com.lts.service;

import java.util.List;

import com.lts.pojo.Author;

public interface AuthorService {

	List<Author> list();
	
	int add(Author author);
	
	void delete(Author author);
	
	List<Author> search(String b_id);
}
