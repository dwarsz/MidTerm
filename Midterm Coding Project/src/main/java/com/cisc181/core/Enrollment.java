package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	
	private UUID StudentID;
	
	private UUID EnrollmentID;
	
	private double Grade;
	
	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	private void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	private void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	private void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	private Enrollment() {
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		
		this.EnrollmentID =  UUID.randomUUID();
	}
	
	public void setGrade(double grade) {
		this.Grade = grade;
	}
	
}