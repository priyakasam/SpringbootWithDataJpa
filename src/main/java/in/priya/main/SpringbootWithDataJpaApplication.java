package in.priya.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.priya.main.entities.Student;
import in.priya.main.services.StudentService;
import in.priya.main.services.StudentServiceImpl;

@SpringBootApplication
public class SpringbootWithDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootWithDataJpaApplication.class, args);
	    StudentService stdservice=context.getBean(StudentServiceImpl.class);
	    
//	    insert operation
	    
	    
//	     Student std=new Student();
//	     std.setName("priya");
//	     std.setRollno(598);
//	     std.setMarks(98.0f);
//	     boolean status=stdservice.addStudentDetails(std);
//	     if(status)
//	     {
//	    	 System.out.println("Student inserted successfully");
//	     }
//	     else
//	     {
//	    	 System.out.println("Error in inserting Student Details");
//	     }
//	
	    
//	    select operation
//	    
//	    List<Student> stdlist=stdservice.getallDetails();
//	    for(Student std:stdlist)
//	    {
//	    	System.out.println("Id:"+std.getId());
//	    	System.out.println("Name:"+std.getName());
//	    	System.out.println("Rollno:"+std.getRollno());
//	    	System.out.println("Marks:"+std.getMarks());
//	    	
//	    	System.out.println("-------------------------------");
//	    }
	   
	    
//	    get studnt by id
	    
//	    Student std=stdservice.getDetailsbyId(3L);
//	    if(std!=null)
//	    {
//	    	
//	    
//	    System.out.println("Id:"+std.getId());
//    	System.out.println("Name:"+std.getName());
//    	System.out.println("Rollno:"+std.getRollno());
//    	System.out.println("Marks:"+std.getMarks());
//	    }
//	    else
//	    {
//	    	System.out.println("Student not found");
//	    }
	    
	    
//	    UYpdate Operation
	    
//	boolean status= stdservice.updateStddetails(1L, 99.2f);
//	if(status)
//	{
//		System.out.println("Students updated successfully");
//	}
//	else
//	{
//		System.out.println("Error occured in updating details");
//	}
//	    
	    
	    
	    
//	    DELETE OPERATION
	    
	    
	    boolean status=stdservice.DeleteStdbyud(2L);
	    if(status)
	    	{
	    		System.out.println("Student details deleted successfully");
	    	}
	    	else
	    	{
	    		System.out.println("Error occured in deleting details");
	    	}
	    
	     
	}

}
