package it.sella.com;

public interface QUERY_UTILS {

	public static final String INSERT_STUD_REC="insert into student (sid,sname,marks) values (:sid,:sname,:marks)";
	public static final String UPDATE_STUD_REC_JDBC_TEMP = "update student set sid = ?,sname = ?,marks = ?";
	public static final String UPDATE_STUD_REC_NAMED_PRAMA = "update student set sid = :sid,sname = :sname,marks = :marks";
	public static final String COUNT_REC = "select count(*) from student";
	public static final String SELECT_REC = "select sid,sname,marks from student where marks <= 78";
	
	
}
