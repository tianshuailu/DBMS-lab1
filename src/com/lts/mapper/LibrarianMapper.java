package com.lts.mapper;

import java.util.List;

import com.lts.pojo.Librarian;

public interface LibrarianMapper {

	public List<Librarian> list();
	
	public int add(Librarian book);
	
	public int update(Librarian book);
	
	public void delete(String l_id);
	
	public Librarian search(String l_id);
	
}
