package ISO2LAB.Iteration1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.*;


/**
 * Testing class for Person.java, the class test some variables from Person.java
 * @author: Carlos Almodóvar Román
 * @version: 1.0.0
 */

public class PersonTest {
	
	/**
     * Auto-generated method
     */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}
	
	/**
     * Auto-generated method
     */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}
	
	/**
     * Auto-generated method
     */
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before -> How many times do i appear?");
	}
	
	/**
     * Auto-generated method
     */
	@After
	public void tearDown() throws Exception {
		System.out.println("@After -> How many times do i appear?");
	}

	/**
     * Auto-generated method modified to test the variable Name from Person.java
     */
	@Test
	public void testGetName() throws Exception {
		Person p = new Person();
		String nameToTest = "Lionel";
		assertEquals(nameToTest, p.getName());
	}

	/**
     * Auto-generated method modified to test the variable Surname from Person.java
     */
	@Test
	public void testGetSurname() throws Exception {
		Person p = new Person();
		String surnameToTest = "Messi";
		assertEquals(surnameToTest, p.getSurname());
	}

	/**
     * Auto-generated method modified to test the variable State from Person.java
     */
	@Test
	public void testState() throws Exception {
		Person p = new Person();
		State stateToTest = State.HEALTHY;
		assertEquals(stateToTest, p.getState());
	}

	/**
     * Auto-generated method modified to test the variable Contacts from Person.java
     */
	@Test
	public void testContacts() throws Exception {
		Person p = new Person();
		assertNull(null, p.getContacts());
	}

}
