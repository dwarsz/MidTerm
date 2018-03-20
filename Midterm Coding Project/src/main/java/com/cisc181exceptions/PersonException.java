package com.cisc181exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception{

	private Person person;
	
	public PersonException() {
		
	}
	
	public PersonException(String message) {
		super(message);
	}
	
}
