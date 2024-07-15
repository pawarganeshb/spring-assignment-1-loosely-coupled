package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory bf = new FileSystemXmlApplicationContext("beans.xml");
		Student student1 = (Student) bf.getBean("student1");		
		
		System.out.println(student1.getStudentName());
		System.out.println(student1.getMarks());
		System.out.println(student1.getGrade());
		System.out.println("******************");
		System.out.println(student1.getStudent().getStudentName());
		System.out.println(student1.getStudent().getMarks());
		System.out.println(student1.getStudent().getGrade());
	}

}
