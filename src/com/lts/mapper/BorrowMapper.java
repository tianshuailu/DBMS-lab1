package com.lts.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lts.pojo.Borrow;

public interface BorrowMapper {

	public List<Borrow> list();
	
	public int add(Borrow borrow);
	
	public int update(Borrow borrow);
	
	public void delete(@Param(value = "r_id")String r_id,@Param(value = "b_id")String b_id);
	
	public List<Borrow> search(@Param(value = "r_id")String r_id,@Param(value = "b_id")String b_id);
	
}
