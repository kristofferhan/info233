package no.uib.info233.v2017.yih002.oblig1;

/**
 * Abstract superclass for person.
 * @author Kristoffer Hansen
 * @version 0.1
 */

public abstract class Person {

	private String personType;
	
	public void setPersonType(String personType) {
		this.personType = personType;
	}
	
	public String getPersonType() {
		return toString();
	}

	@Override
	public String toString() {
		return personType;
	}
	
	
	
}
