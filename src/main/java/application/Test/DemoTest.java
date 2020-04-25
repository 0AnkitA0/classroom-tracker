package application.Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import application.Entities.Student;
import application.Service.ClassroomService;

public class DemoTest {

	@Autowired
	private static ClassroomService classroomService;
	public static void main(String[] args) {
		
		int id = 1;
		
		List<Student> students = classroomService.students(id);
		
	}
}
