package oblig1;

/**
 * Class that represents a GeekPerson.
 * @author kristofferh
 * @version 0.1
 */

public class GeekPerson extends Person {
	private Queue<Person> geek = new Queue<>();

	public GeekPerson() {
		super.setPersonType("Geek");
		super.setPersonBag(geek);
	}
	
	@Override 
	public String chooseActivity(BagInterface<String> activities) {
		return activities.toString();
	}
	
	
	
}
