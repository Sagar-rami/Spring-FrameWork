package it.sella.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("studDao")
public class StudentDao implements IStudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private StudentMapper mapper;

	@Override
	public List<Student> getStudentDetails() {
		return (List<Student>)jdbcTemplate.query("select sid,sname,marks from student", mapper);
	}

	@Override
	public List<Student> getMarksInfo(int minMarks, int maxMarks) {
		System.out.println("Min Marks :: "+minMarks);
		System.out.println("Max Marks :: "+maxMarks);
		return (List<Student>)jdbcTemplate.query("select sid,sname,marks from student where marks >= ? and marks <= ?",
				new Object[] {minMarks,maxMarks}, mapper);
	}

}
