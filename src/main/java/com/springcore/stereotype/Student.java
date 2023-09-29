package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
//@Component # It's true in without set variable.
public class Student {
	@Value("Parth Kathiriya")
	private String studentName;
	@Value("Surat")
	private String city;
	@Value("#{temp}")
	private List<String> list;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", list=" + list + "]";
	}

}
