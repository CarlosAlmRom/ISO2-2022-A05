package ISO2LAB.Iteration1;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import Domain.*;

/**
 * Testing class for Tracker.java, the class test some variables and methods from Tracker.java
 * @author: Carlos Almodóvar Román
 * @version: 1.0.0
 */

public class TrackerTest {
	
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
     * Auto-generated method modified to test the method DetectInfectedPerson() from Tracker.java
     */
	@Test
	public void testDetectInfectedPerson() throws Exception {
		Tracker t = new Tracker();
		assertEquals(true, t.DetectInfectedPerson());
	}

	/**
     * Auto-generated method modified to test the method ConfinePerson() from Tracker.java
     */
	@Test
	public void testConfinePerson() throws Exception {
		Tracker t = new Tracker();
		Person p = new Person();
		State valueToTest = p.getState();
		assertEquals(valueToTest, t.ConfinePerson());
	}

	/**
     * Auto-generated method modified to test the method HospitalizePerson() from Tracker.java
     */
	@Test
	public void testHospitalizePerson() throws Exception {
		Tracker t = new Tracker();
		Person p = new Person();
		State valueToTest = p.getState();
		assertEquals(valueToTest, t.HospitalizePerson());
	}

	/**
     * Auto-generated method modified to test the method AlertContactsNetwork() from Tracker.java
     */
	@Test
	public void AlertContactsNetwork() throws Exception {
		Tracker t = new Tracker();
		int valueToTest = t.AlertContactsNetwork();
		assertTrue(valueToTest > 5);
	}

}
