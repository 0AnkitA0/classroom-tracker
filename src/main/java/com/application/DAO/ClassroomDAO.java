package com.application.DAO;

import java.util.List;

import com.application.Entities.Classroom;
import com.application.Entities.Student;

public interface ClassroomDAO {
	
	public List<Student> students(int id);

	public List<Classroom> classrooms();

}
