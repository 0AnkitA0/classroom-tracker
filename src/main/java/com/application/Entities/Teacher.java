package com.application.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class Teacher {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="teacher_id")
	private int id;
	
	@Column(name="teacher_name")
	private String teacherName;
	
	@ManyToOne
	@JoinColumn(name="class_id")
	private Classroom classId;
	
    public Classroom getClassId() {
		return classId;
	}

	public void setClassId(Classroom classId) {
		this.classId = classId;
	}

	public Teacher() {
		
	}   
	
	public Teacher(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	
	
}
