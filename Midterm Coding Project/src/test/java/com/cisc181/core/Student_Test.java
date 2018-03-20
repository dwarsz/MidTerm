package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Student> StudentRecords = new ArrayList<Student>();
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		StudentRecords.add(new Student (null, null, null, null, null, null, null, null));
		
		
		
		
	}

	@Test
	public void test() {
		ArrayList<Course> CourseRecords = new ArrayList<Course>();
		
		CourseRecords.add(new Course());
		CourseRecords.add(new Course());
		CourseRecords.add(new Course());
		
		ArrayList<Semester> Semesters= new ArrayList<Semester>();
		
		Date Fall = new Date(2018, 9, 5);
		
		Date Spring = new Date(2019, 1, 5);
		
		Semester s1 = new Semester();
		
		s1.setStartDate(Fall);
		
		Semesters.add(s1);
		
		Semester s2 = new Semester();
		
		s1.setStartDate(Spring);
		
		Semesters.add(s2);
		
		ArrayList<Section> Sections= new ArrayList<Section>();
		
		Section sect1 = new Section();
		
		sect1.setSectionID(null);
		
		Sections.add(sect1);
		
		Section sect2 = new Section();
		
		sect2.setSectionID(UUID.randomUUID());
		
		Sections.add(sect2);
		
		Section sect3 = new Section();
		
		sect3.setSectionID(null);
		
		Sections.add(sect3);
		
		Section sect4 = new Section();
		
		sect4.setSectionID(null);
		
		Sections.add(sect4);
		
		Section sect5 = new Section();
		
		sect5.setSectionID(null);
		
		Sections.add(sect5);
		
		Section sect6 = new Section();
		
		sect6.setSectionID(null);
		
		Sections.add(sect6);
		assertEquals(1, 1);
	}
}