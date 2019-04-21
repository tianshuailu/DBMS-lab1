package com.lts.pojo;

public class Librarian {

	private String l_id;
	private String l_sex;
	private String l_name;
	public String getL_id() {
		return l_id;
	}
	public void setL_id(String l_id) {
		this.l_id = l_id;
	}
	public String getL_sex() {
		return l_sex;
	}
	public void setL_sex(String l_sex) {
		this.l_sex = l_sex;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	@Override
	public String toString() {
		return "Librarian [l_id=" + l_id + ", l_sex=" + l_sex + ", l_name=" + l_name + "]";
	}
	
}
