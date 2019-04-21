package com.lts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lts.mapper.BorrowMapper;
import com.lts.pojo.Borrow;
import com.lts.service.BorrowService;

@Service
public class BorrowServiceImpl implements BorrowService{

	@Autowired
	BorrowMapper borrowMapper;
	
	public List<Borrow> list() {
		return borrowMapper.list();
	}
	
	public int add(Borrow borrow) {
		return borrowMapper.add(borrow);
	}

	public int update(Borrow borrow) {
		return borrowMapper.update(borrow);
	}

	public void delete(String r_id,String b_id) {
		borrowMapper.delete(r_id,b_id);
	}
	
	public List<Borrow> search(String r_id,String b_id) {
		return borrowMapper.search(r_id,b_id);
	}
}
