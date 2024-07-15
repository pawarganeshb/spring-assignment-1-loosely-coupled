package com.app;

public class Student {
	private String studentName;
	private String grade;
	private String marks;
	private Student student;
	
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getGrade() {
		return grade;
	}

	public String getMarks() {
		return marks;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", grade=" + grade + ", marks=" + marks + "]";
	}
	
}