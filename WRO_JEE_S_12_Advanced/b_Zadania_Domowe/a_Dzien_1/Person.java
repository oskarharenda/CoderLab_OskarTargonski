package b_Zadania_Domowe.a_Dzien_1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Person {

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	String firstName;
	String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "lastName= " + lastName + " firstName, = " + firstName ;
	}


}
