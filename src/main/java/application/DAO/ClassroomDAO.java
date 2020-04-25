package application.DAO;

import java.util.List;

import application.Entities.Student;

public interface ClassroomDAO {
	
	public List<Student> students(int id);

}
