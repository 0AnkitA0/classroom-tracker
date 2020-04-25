package com.application.Service;

import java.util.List;

import com.application.Entities.Classroom;
import com.application.Entities.Student;

public interface ClassroomService {
	
	public List<Student> students(int id);

	public List<Classroom> classroom();
}
