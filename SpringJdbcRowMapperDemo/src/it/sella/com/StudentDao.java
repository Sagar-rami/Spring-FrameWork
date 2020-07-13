package it.sella.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class StudentDao extends JdbcDaoSupport{

	public int studentCount() {
		int count = getJdbcTemplate().queryForObject(QUERY_UTILS.COUNT_REC, Integer.class);
		return count;
	}
	
	public List<Student> retrieveRecord(){
		return getJdbcTemplate().query(QUERY_UTILS.SELECT_REC, new RowMapper<Student>() {
			public Student mapRow(ResultSet resultSet,int rownum) throws SQLException{
				Student student = new Student();
				student.setSid(resultSet.getInt(1));
				student.setSname(resultSet.getString(2));
				student.setMarks(resultSet.getInt(3));
				return student;
			}});
	}
}
