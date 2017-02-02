package oblig1;

/**
 * Abstract superclass for person.
 * @author kristofferh
 * @version 0.1
 */

public abstract class Person {
	private String personType;
	private Queue<Person> PersonBag;

	public void setPersonType(String personType) {
		this.personType = personType;
	}
	
	public void setPersonBag(Queue<Person> personBag) {
		PersonBag = personBag;
	}
	
	public String getPersonType() {
		return personType;
	}
	
	public Queue<Person> getPersonBag() {
		return PersonBag;
	}
	
	public String chooseActivity(BagInterface<String> activites) {
		return null;
	}
	
}
