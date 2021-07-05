package com.encore.rest.dto;

public class Customer {
	private String singer;
	private String title;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String singer, String title) {
		super();
		this.singer = singer;
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Customer [singer=" + singer + ", title=" + title + "]";
	}
	

}
