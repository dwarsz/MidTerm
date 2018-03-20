package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	
	public UUID getSemesterID() {
		return SemesterID;
	}

	private void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	private void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	private UUID SemesterID;
	
	private Date StartDate;
	
	private Date EndDate;
	
}


