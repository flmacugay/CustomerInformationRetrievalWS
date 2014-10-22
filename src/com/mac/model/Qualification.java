package com.mac.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder= {"qualId", "course", "school"})
public class Qualification {
	
	private int qualId;
	private String course;
	private String school;
	
	public Qualification(int qualId, String course, String school) {
		super();
		this.qualId = qualId;
		this.course = course;
		this.school = school;
	}
	@XmlElement(name="qual_id")
	public int getQualId() {
		return qualId;
	}
	public void setQualId(int qualId) {
		this.qualId = qualId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
}
