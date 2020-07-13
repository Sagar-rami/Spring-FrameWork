package it.sella.com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet res, int index) throws SQLException {
		Student student = new Student();
		student.setSid(res.getInt(1));
		student.setSname(res.getString(2));
		student.setMarks(res.getInt(3));
		return student;
	}

}
