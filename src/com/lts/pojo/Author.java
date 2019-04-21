package com.lts.pojo;

public class Author {

	private String b_id;
	private String author;
	public String getB_id() {
		return b_id;
	}
	public void setB_id(String b_id) {
		this.b_id = b_id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Author [b_id=" + b_id + ", author=" + author + "]";
	}
	
}
