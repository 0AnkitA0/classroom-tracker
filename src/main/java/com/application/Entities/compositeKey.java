package com.application.Entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Embeddable
public class compositeKey implements Serializable {
	
	@Column(name="id")
	private int id;
	
	@OneToMany
	@JoinColumn(name="student_id")
	private Student studentId;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public compositeKey() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (!(o instanceof compositeKey)) return false;
        compositeKey that = (compositeKey) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getStudentId(), that.getStudentId());
    }

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getId(),getStudentId());
	}
	
	
}
