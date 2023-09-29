package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

//	GET STUDENT ID, NAME , ADDRESS
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

//	SET STUDENT ID, NAME, ADDRESS
	public void setStudentId(int studentId) {
		System.out.println("Setting studentId");
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting studentName");
		this.studentName = studentName;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting studentAddress");
		this.studentAddress = studentAddress;
	}

//	CREATE CONSTRUCTOR
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

//	CREATE AUTO-GENERATED CONSTRUCTOR
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	USE TO STRING METHOD FOR RETURN READABLE FORMATE
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
}
