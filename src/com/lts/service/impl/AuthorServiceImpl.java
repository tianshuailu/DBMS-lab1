package com.lts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lts.mapper.AuthorMapper;
import com.lts.pojo.Author;
import com.lts.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorMapper authorMapper;
	
	public List<Author> list() {
		return authorMapper.list();
	}
	
	public int add(Author author) {
		return authorMapper.add(author);
	}

	public void delete(Author author) {
		authorMapper.delete(author);
	}
	
	public List<Author> search(String b_id) {
		return authorMapper.search(b_id);
	}
}
