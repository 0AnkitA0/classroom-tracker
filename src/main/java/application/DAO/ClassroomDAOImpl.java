package application.DAO;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import application.Entities.Classroom;
import application.Entities.Student;

@Repository
public class ClassroomDAOImpl implements ClassroomDAO {
	
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public List<Student> students(int id) {
	
		// sessionfactory
		Session session = sessionFactory.getCurrentSession();
		
		Query<Classroom> theQuery = 
				session.createQuery("from Classroom where id="+id,
											Classroom.class);
		
		// execute query and get result list
		List<Classroom> Classrooms = theQuery.getResultList();
		
		List<Student> students = null;
		
		for(Classroom c : Classrooms) {
			students.add(c.getKey().getStudentId());
		}
		
		
		return students;
	}

}
