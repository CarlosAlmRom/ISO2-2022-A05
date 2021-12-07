/**
 * 
 */
package ISO2LAB.Iteration1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.*;
public class PersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before -> How many times do i appear?");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("@After -> How many times do i appear?");
	}

	@Test
	public void testGetName() throws Exception {
		Person p = new Person();
		String nameToTest = "Lionel";
		assertEquals(nameToTest, p.getName());
	}
	
	@Test
	public void testGetSurname() throws Exception {
		Person p = new Person();
		String surnameToTest = "Messi";
		assertEquals(surnameToTest, p.getSurname());
	}

	@Test
	public void testState() throws Exception {
		Person p = new Person();
		State stateToTest = State.HEALTHY;
		assertEquals(stateToTest, p.getState());
	}
	
	@Test
	public void testContacts() throws Exception {
		Person p = new Person();
		assertNull(null, p.getContacts());
	}

}
