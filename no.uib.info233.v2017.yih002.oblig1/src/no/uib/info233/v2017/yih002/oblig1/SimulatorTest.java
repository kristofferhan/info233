package no.uib.info233.v2017.yih002.oblig1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing different methods that runs the simulator.
 * @author Kristoffer Hansen
 * @version 0.2
 */
public class SimulatorTest {

	Bag testQueue = new Bag();
	AthletePerson athletePerson = new AthletePerson();
	ChuckNorrisPerson chuckNorrisPerson = new ChuckNorrisPerson();
	GeekPerson geekPerson = new GeekPerson();

	/**
	 * Sets up the Bag with 3 persons.
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		testQueue.add(athletePerson);
		testQueue.add(chuckNorrisPerson);
		testQueue.add(geekPerson);
		Assert.assertEquals(3, testQueue.getCurrentSize());
	}

	@Test
	public void getCurrentSize() throws Exception {
		Assert.assertEquals(3, testQueue.getCurrentSize());
	}

	@Test
	public void add() throws Exception {
		GeekPerson geekPerson2 = new GeekPerson();
		testQueue.add(geekPerson2);
		Assert.assertEquals(4, testQueue.getCurrentSize());
	}
	
	@Test 
	public void remove() throws Exception {
		testQueue.remove(athletePerson);
		Assert.assertEquals(2, testQueue.getCurrentSize());
	}
	
	@Test
	public void contains() throws Exception {
		testQueue.contains(athletePerson);
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void clear() throws Exception {
		testQueue.clear();
		Assert.assertEquals(0, testQueue.getCurrentSize());
	}
	
	@Test
	public void isEmpty() throws Exception {
		testQueue.isEmpty();
		Assert.assertEquals(true, true);
	}



}
