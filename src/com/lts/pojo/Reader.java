package com.lts.pojo;

public class Reader {

	private String r_id;
	private String r_sex;
	private String r_name;
	private String r_tel;
	public String getR_id() {
		return r_id;
	}
	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
	public String getR_sex() {
		return r_sex;
	}
	public void setR_sex(String r_sex) {
		this.r_sex = r_sex;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_tel() {
		return r_tel;
	}
	public void setR_tel(String r_tel) {
		this.r_tel = r_tel;
	}
	@Override
	public String toString() {
		return "Reader [r_id=" + r_id + ", r_sex=" + r_sex + ", r_name=" + r_name + ", r_tel=" + r_tel + "]";
	}
	
}
