package com.lts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lts.service.ReaderService;
import com.lts.mapper.ReaderMapper;
import com.lts.pojo.Reader;


@Service
public class ReaderServiceImpl implements ReaderService{

	@Autowired
	ReaderMapper readerMapper;
	
	public List<Reader> list() {
		return readerMapper.list();
	}
	
	public int add(Reader reader) {
		return readerMapper.add(reader);
	}

	public int update(Reader reader) {
		return readerMapper.update(reader);
	}

	public void delete(String r_id) {
		readerMapper.delete(r_id);
	}
	
	public Reader search(String r_id) {
		return readerMapper.search(r_id);
	}
}
