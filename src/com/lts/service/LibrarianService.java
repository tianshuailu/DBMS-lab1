package com.lts.service;

import java.util.List;

import com.lts.pojo.Librarian;

public interface LibrarianService {

	List<Librarian> list();
	
	int add(Librarian librarian);
	
	int update(Librarian librarian);
	
	void delete(String l_id);
	
	Librarian search(String l_id);
}
