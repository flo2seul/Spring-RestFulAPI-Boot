package com.encore.board.domain;

public class Board {
	private int no;
	private String title;
	private String content;
	private int count;
	private String writeDate;
	
	private Member member;

	public Board(int no, String title, String content, int count, String writeDate, Member member) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.count = count;
		this.writeDate = writeDate;
		this.member = member;
	}

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board(int no, String title, String content, int count, String writeDate) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.count = count;
		this.writeDate = writeDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", content=" + content + ", count=" + count + ", writeDate="
				+ writeDate + ", member=" + member + "]";
	}
	
	

}
