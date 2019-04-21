package com.lts.pojo;

public class Borrow {

	private String R_id;
	private String B_id;
	private String borrow_date;
	private String return_date;
	public String getR_id() {
		return R_id;
	}
	public void setR_id(String r_id) {
		R_id = r_id;
	}
	public String getB_id() {
		return B_id;
	}
	public void setB_id(String b_id) {
		B_id = b_id;
	}
	public String getBorrow_date() {
		return borrow_date;
	}
	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	@Override
	public String toString() {
		return "Borrow [R_id=" + R_id + ", B_id=" + B_id + ", borrow_date=" + borrow_date + ", return_date="
				+ return_date + "]";
	}
	
}
