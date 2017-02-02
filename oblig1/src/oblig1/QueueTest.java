package oblig1;

import org.junit.*;

import static org.junit.Assert.*;

public class QueueTest {

	private BagInterface<Person> personBag;
	private Person geekPerson1;
	private Person athletePerson1;
	private Person chuckNorrisPerson1;
	
	@Before
	public void setUp() throws Exception {
		personBag = new Queue<>();
		geekPerson1 = new GeekPerson();
		athletePerson1 = new AthletePerson();
		chuckNorrisPerson1 = new ChuckNorrisPerson();
	}
	
	@Test
	public void getCurrentSize() throws Exception {
		assertEquals(3, personBag.getCurrentSize());
	}
	
	@Test 
	public void isFull() throws Exception {
		assertFalse(personBag.isFull());
	}
	
	@Test
	public void isEmpty() throws Exception {
		assertFalse(personBag.isEmpty());
	}
	
	@Test
	public void add() throws Exception {
		Person geekPerson2 = new GeekPerson();
		assertTrue(personBag.add(geekPerson2));
	}
	
	@Test
	public void remove() throws Exception {
		assertEquals(athletePerson1, personBag.remove());
	}
	
	@Test
	public void removeSpecificItem() throws Exception {
		assertTrue(personBag.remove(chuckNorrisPerson1));
	}
	
	@Test
	public void clear() throws Exception {
		personBag.clear();
		assertEquals(0, personBag.getCurrentSize());
	}
	
	@Test
	public int getFrequencyOf(Person geekPerson2) throws Exception {
		int counter = 0;
		for (Person personBag: personType) {
			if (geekPerson2.equals(personType)){
				counter++;
			}
		}
		return counter;
	}
	
	
	
	
	
	
	
}
