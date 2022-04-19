package com.spr;

public class Student {
	private int slno;
	private String sname;
	private int s1,s2;
	public Student() {}
	public Student(int slno, String sname, int s1, int s2) {
		this.slno = slno;
		this.sname = sname;
		this.s1 = s1;
		this.s2 = s2;
	}
	public int getSlno() {
		return slno;
	}
	public String getSname() {
		return sname;
	}
	public int getS1() {
		return s1;
	}
	public int getS2() {
		return s2;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setS1(int s1) {
		this.s1 = s1;
	}
	public void setS2(int s2) {
		this.s2 = s2;
	}
	@Override
	public String toString() {
		return "Student [slno=" + slno + ", sname=" + sname + ", s1=" + s1 + ", s2=" + s2 + "]";
	}
	
	
}
