package com.lts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lts.mapper.LibrarianMapper;
import com.lts.pojo.Librarian;
import com.lts.service.LibrarianService;

@Service
public class LibrarianServiceImpl implements LibrarianService{

	@Autowired
	LibrarianMapper librarianMapper;
	
	public List<Librarian> list() {
		return librarianMapper.list();
	}
	
	public int add(Librarian librarian) {
		return librarianMapper.add(librarian);
	}

	public int update(Librarian librarian) {
		return librarianMapper.update(librarian);
	}

	public void delete(String l_id) {
		librarianMapper.delete(l_id);
	}
	
	public Librarian search(String l_id) {
		return librarianMapper.search(l_id);
	}
}
