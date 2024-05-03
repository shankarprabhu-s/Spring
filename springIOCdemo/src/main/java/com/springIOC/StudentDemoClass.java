package com.springIOC;

public class StudentDemoClass {

	private String sid;
	private String sname;
	public StudentDemoClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "StudentDemoClass [sid=" + sid + ", sname=" + sname + "]";
	}
	
	

}
