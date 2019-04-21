package com.lts.service;

import java.util.List;

import com.lts.pojo.Reader;

public interface ReaderService {

	List<Reader> list();
	
	int add(Reader reader);
	
	int update(Reader reader);
	
	void delete(String r_id);
	
	Reader search(String r_id);
}
