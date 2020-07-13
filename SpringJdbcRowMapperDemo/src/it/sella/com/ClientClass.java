package it.sella.com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringApplication.xml");
		StudentDao dao = (StudentDao)context.getBean("sdao");
		List<Student> studList = dao.retrieveRecord();
		
		for(Student student : studList) {
			System.out.println("Student ID :: "+student.getSid()+" Student Name :: "+student.getSname()+" Student Marks :: "+student.getMarks());
		}
	}
}
