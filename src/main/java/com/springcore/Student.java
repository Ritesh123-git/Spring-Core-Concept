package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentaddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public Student(int studentId, String studentName, String studentaddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentaddress = studentaddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentaddress=" + studentaddress
				+ "]";
	}
	
	
	

}
