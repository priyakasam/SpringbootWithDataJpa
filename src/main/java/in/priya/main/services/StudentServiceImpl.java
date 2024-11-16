package in.priya.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.priya.main.Repository.StudentRepository;
import in.priya.main.entities.Student;
@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
    private StudentRepository studentRepository;
	
	
	@Override
	public boolean addStudentDetails(Student std)
	{
		boolean status=false;
		try
		{
			studentRepository.save(std);
			status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		
		return status;
	}
	@Override
	public List<Student> getallDetails() {
		
		return studentRepository.findAll();
	}
	@Override
	public Student getDetailsbyId(Long id) {
		Optional<Student> std=studentRepository.findById(id);
		if(std.isPresent())
		{
			 return std.get();
		}
		return null ;
	}
	@Override
	public boolean updateStddetails(long id, float marks) {
		 Student std=getDetailsbyId(id);
		 if(std!=null)
		 {
			std.setMarks(marks);
			studentRepository.save(std);
			return true;
			
		 }
		return false;
	}
	@Override
	public boolean DeleteStdbyud(Long id) {
		boolean status=false;
		try
		{
			studentRepository.deleteById(id);
			status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		return status;
	}
	
	

}
