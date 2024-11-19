package com.edubridge.one2many.model;

import jakarta.persistence.CascadeType;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="department786")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer departmentId;
	 private String departmentName;
	 
	 @OneToMany(mappedBy ="department", cascade = CascadeType.ALL)
	 private List<Student>students;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", students="
				+ students + "]";
	}

	 
}
