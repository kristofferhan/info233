package oblig1;

/**
 * Class that represents an AthletePerson.
 * @author kristofferh
 * @version 0.1
 */

public class AthletePerson extends Person {
	private Queue<Person> athlete = new Queue<>();

	public AthletePerson() {
		super.setPersonType("Athlete");
		super.setPersonBag(athlete);
	}
	
	@Override 
	public String chooseActivity(BagInterface<String> activities) {
		return activities.toString();
	}
	
	
	
}
