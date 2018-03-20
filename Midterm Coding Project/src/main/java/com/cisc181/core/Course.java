package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;


public class Course {

	private UUID CourseID;
	
	private String CourseName;
	
	private int GradePoints;
	
	private eMajor eMajor;
	
	private void setCourseID(UUID CourseID) {
		this.CourseID=CourseID;
	}

	private void setCourseName(String courseName) {
		CourseName = courseName;
	}

	private void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	private void seteMajor(eMajor eMajor) {
		this.eMajor = eMajor;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public eMajor geteMajor() {
		return eMajor;
	}
	
}


