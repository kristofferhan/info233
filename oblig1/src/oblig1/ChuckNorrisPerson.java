package oblig1;

/**
 * Class that represents a ChuckNorrisPerson.
 * @author kristofferh
 * @version 0.1
 */

public class ChuckNorrisPerson extends Person {
	private Queue<Person> chucknorris = new Queue<>();

	public ChuckNorrisPerson() {
		super.setPersonType("Chuck Norris");
		super.setPersonBag(chucknorris);
	}
	
	@Override 
	public String chooseActivity(BagInterface<String> activities) {
		return activities.toString();
	}
	
	
	
}
