package com.lts.pojo;


public class Book {

	private String b_id;
	private String b_name;
	private String b_publisher;
	private int b_amount;
	private String b_location;
	private String l_id;
	
	public String getB_id() {
		return b_id;
	}
	public void setB_id(String b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_publisher() {
		return b_publisher;
	}
	public void setB_publisher(String b_publisher) {
		this.b_publisher = b_publisher;
	}
	public int getB_amount() {
		return b_amount;
	}
	public void setB_amount(int b_amount) {
		this.b_amount = b_amount;
	}
	public String getB_location() {
		return b_location;
	}
	public void setB_location(String b_location) {
		this.b_location = b_location;
	}
	public String getL_id() {
		return l_id;
	}
	public void setL_id(String l_id) {
		this.l_id = l_id;
	}
	@Override
	public String toString() {
		return "Book [b_id=" + b_id + ", b_name=" + b_name + ", b_publisher=" + b_publisher + ", b_amount=" + b_amount
				+ ", b_location=" + b_location + ", l_id=" + l_id + "]";
	}
	
	
}
