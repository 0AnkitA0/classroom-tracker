package com.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.application.DAO.ClassroomDAO;
import com.application.Entities.Classroom;
import com.application.Entities.Student;

@Service
public class ClassroomServiceImpl implements ClassroomService {
	
	@Autowired
	private ClassroomDAO classroomDAO;


	@Override
	@Transactional
	public List<Student> students(int id) {
		// TODO Auto-generated method stub
		return classroomDAO.students(id);
	}


	@Override
	public List<Classroom> classroom() {
		// TODO Auto-generated method stub
		return classroomDAO.classrooms();
	}

}
