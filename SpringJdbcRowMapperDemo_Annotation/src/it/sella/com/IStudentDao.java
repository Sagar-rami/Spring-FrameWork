package it.sella.com;

import java.util.List;

public interface IStudentDao {

	public List<Student> getStudentDetails();
	public List<Student> getMarksInfo(int minMarks,int maxMarks);
	
}
