package com.cisc181.core;

import com.cisc181exceptions.*;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@SuppressWarnings("deprecation")
	static Date Date1 = new Date(1900, 8, 5);
	
	@SuppressWarnings("deprecation")
	static Date Date2 = new Date(2000, 8, 5);
	
	static String Phone_number1 = "215-555-0sdsd537";
	
	static Staff s1 = new Staff("","","",Date2,"","","","",8,1000,Date2,eTitle.MRS); 
    
	static Staff s2 = new Staff("","","",Date2,"","","","",8,1000,Date2,eTitle.MRS);
    
	static Staff s3 = new Staff("","","",Date2,"","","","",8,1000,Date2,eTitle.MRS);
    
	static Staff s4 = new Staff("","","",Date2,"","","","",8,1000,Date2,eTitle.MRS);
    
	static Staff s5 = new Staff("","","",Date2,"","","","",8,1000,Date2,eTitle.MRS);

	
	@BeforeClass
	public static void setup() {
		   

	    
	}
	
	
	
	@Test
	public void testPersonException() {
		ArrayList<Staff> staffs = new ArrayList<Staff>();

	    staffs.add(s1);  staffs.add(s2);  staffs.add(s3);
	    staffs.add(s4);  staffs.add(s5);
		double total = 0;
		int counter = 0;
	    for(Staff s: staffs) {
	    	total += s.getSalary();
	    	counter++; 
	    	}
	    	   
		    double avg = total/counter;
		    
		  assertEquals(1000,avg);
	    try {	
	    	Staff s6 = new Staff("","","",Date1,"","","","",8,1000,Date2,eTitle.MRS); //wrong DOB
	    	
	    } 
	    catch(PersonException e) {
	    	System.out.print("A PersonException was thrown");
	    	}
	    
	    
	    try {	
	    	Staff s7 = new  Staff("","","",Date2,"",Phone_number1,"","",8,1000,Date2,eTitle.MRS); // wrong phone number format
	    	
	    } 
	    catch(PersonException e) {
	    	System.out.print("A PersonException was thrown");
	    	}
	    }
	  
		
	 
		
	}	


