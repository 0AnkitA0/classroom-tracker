package com.application.RESTController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.Entities.Classroom;
import com.application.Entities.Student;
import com.application.Service.ClassroomService;

@RestController
@RequestMapping("/api")
public class RESTController {
	
	@Autowired
	private ClassroomService classroomService;
	
	@GetMapping("/classrooms/")
	public List<Classroom> classrooms(){
	
		return classroomService.classroom();
	}
	
	@GetMapping(value="/student/{id}",produces="application/json")
	public List<Student> students(@PathVariable int id){
	
		return classroomService.students(id);
	}

}
