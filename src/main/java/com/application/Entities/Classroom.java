package com.application.Entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="classrooms")
public class Classroom {
	
	public Classroom() {
		
	}

	@EmbeddedId
	private compositeKey key;
	
	@ManyToOne
	@JoinColumn(name="teacher_id")
	private Teacher teacherId;
	
	
	public long getId() {
		return getId();
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	
	

	public compositeKey getKey() {
		return key;
	}

	public void setKey(compositeKey key) {
		this.key = key;
	}

	public Teacher getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Teacher teacherId) {
		this.teacherId = teacherId;
	}

	public Classroom(compositeKey key, Teacher teacherId) {
		this.key = key;
		this.teacherId = teacherId;
	}

	
	
	
}
