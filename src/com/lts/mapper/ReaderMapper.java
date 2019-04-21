package com.lts.mapper;

import java.util.List;

import com.lts.pojo.Reader;

public interface ReaderMapper {

	public List<Reader> list();
	
	public int add(Reader reader);
	
	public int update(Reader reader);
	
	public void delete(String r_id);
	
	public Reader search(String r_id);
	
}
