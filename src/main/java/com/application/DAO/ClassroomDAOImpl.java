package com.application.DAO;


import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.Entities.Classroom;
import com.application.Entities.Student;

@Repository	
public class ClassroomDAOImpl implements ClassroomDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> students(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		
		Classroom classroom = session.get(Classroom.class, id);
		
		Hibernate.initialize(classroom.getStudents());
		
		List<Student> students = classroom.getStudents();
		
		return students;
	}

	@Override
	public List<Classroom> classrooms() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		
		List<Classroom> classrooms = session.createQuery("from Classroom",Classroom.class).getResultList();
		
		return classrooms;
	}

}
