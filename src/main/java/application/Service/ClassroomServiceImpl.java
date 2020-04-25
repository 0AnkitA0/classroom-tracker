package application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import application.DAO.ClassroomDAO;
import application.Entities.Student;

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

}
