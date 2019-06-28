package com.yr.board;

import java.sql.Date;

public class BoardVO {
	// 규칙
	// 멤버변수의 접근지정자 : private
	// Setter, Getter
	// 생성자는 default 생성자가 있어야 함 - 자동으로 만들어줌 (매개변수가 있는 생성자를 만들 때에는 직접 생성)
	private int num;
	private String title;
	private String writer;
	private String Contents;
	private Date reg_date;
	private int hit;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return Contents;
	}
	public void setContents(String contents) {
		Contents = contents;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}
