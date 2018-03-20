package com.cisc181.core;

import java.util.UUID;

public class Section {

	private UUID CourseID;

	private UUID SemesterID;
	
	private UUID SectionID;
	
	private int RoomID;
	
	public UUID getCourseID() {
		return CourseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

	private void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	private void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	private void setRoomID(int roomID) {
		RoomID = roomID;
	}

	
}
