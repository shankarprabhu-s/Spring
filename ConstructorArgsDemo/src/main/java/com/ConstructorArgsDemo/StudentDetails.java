package com.ConstructorArgsDemo;

public class StudentDetails {
	private int id;
	private String name;
	private int sem;
	public StudentDetails(int id, String name, int sem) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", sem=" + sem + "]";
	}

}
