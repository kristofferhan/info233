package oblig1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {
	
	private static Person testPerson;

	@BeforeClass
	public static void setUp() throws Exception {
		testPerson = new GeekPerson();
	}

	@Test
	public void getPersonType() throws Exception {
		assertEquals("Geek", testPerson.getPersonType());
	}
	
	@Test
	public void chooseActivity() throws Exception {
		
	}

}
