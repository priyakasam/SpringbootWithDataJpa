package in.priya.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.priya.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long>
{
	
	

}
