package com.lts.service;

import java.util.List;

import com.lts.pojo.Borrow;

public interface BorrowService {

	List<Borrow> list();
	
	int add(Borrow borrow);
	
	int update(Borrow borrow);
	
	void delete(String r_id,String b_id);
	
	List<Borrow> search(String r_id,String b_id);
	
}
