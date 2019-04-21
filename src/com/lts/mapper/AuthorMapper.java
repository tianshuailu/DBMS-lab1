package com.lts.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lts.pojo.Author;

public interface AuthorMapper {

	public List<Author> list();
	
	public int add(Author author);
	
	public void delete(Author author);
	
	public List<Author> search(String b_id);
	
}
