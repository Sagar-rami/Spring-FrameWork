package it.sella.com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringApplication.xml");
		IStudentDao dao = context.getBean("studDao",StudentDao.class);
		List<Student> studList = dao.getStudentDetails();
		
		for(Student student : studList) {
			System.out.println("Student ID :: "+student.getSid()+" Student Name :: "+student.getSname()+" Student Marks :: "+student.getMarks());
		}
		
		System.out.println("Student details whose marks are in between 35 and 70");
		
		List<Student> marksInfo = dao.getMarksInfo(35, 70);
		
		for(Student student : marksInfo) {
			System.out.println("Student ID :: "+student.getSid()+" Student Name :: "+student.getSname()+" Student Marks :: "+student.getMarks());
		}
	}
}
