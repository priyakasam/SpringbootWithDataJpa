package in.priya.main.services;

import in.priya.main.entities.Student;
import java.util.*;

public interface StudentService
{
	public boolean addStudentDetails(Student std);
	public List<Student> getallDetails();
	public Student getDetailsbyId(Long id);
	public boolean updateStddetails(long id,float marks);
	public boolean DeleteStdbyud(Long id);
	

}
