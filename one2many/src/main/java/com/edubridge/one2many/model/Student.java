package com.edubridge.one2many.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;

import jakarta.persistence.JoinColumn;
@Entity
@Table(name = "students786")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	private String studentName;
	private Long studentMobile;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="department_id")
	private Department department;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Department getDepartments() {
		return department;
	}

	public void setDepartments(Department departments) {
		this.department = departments;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMobile=" + studentMobile
				+ ", departments=" + department + "]";
	}

	public void setDepartment(Department department) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
