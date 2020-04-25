package application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import application.DAO.ClassroomDAO;
import application.Entities.Student;

@Service
public class ClassroomServiceImpl implements ClassroomService {
	
	@Autowired
	private ClassroomDAO customerDAO;


	@Override
	public List<Student> students(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
