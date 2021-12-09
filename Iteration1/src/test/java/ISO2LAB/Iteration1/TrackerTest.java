package ISO2LAB.Iteration1;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import Domain.*;
public class TrackerTest {

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
	public void testDetectInfectedPerson() throws Exception {
		Tracker t = new Tracker();
		assertEquals(true, t.DetectInfectedPerson());
	}

	@Test
	public void testConfinePerson() throws Exception {
		Tracker t = new Tracker();
		Person p = new Person();
		State valueToTest = p.getState();
		assertEquals(valueToTest, t.ConfinePerson());
	}
	
	@Test
	public void testHospitalizePerson() throws Exception {
		Tracker t = new Tracker();
		Person p = new Person();
		State valueToTest = p.getState();
		assertEquals(valueToTest, t.HospitalizePerson());
	}

	@Test
	public void AlertContactsNetwork() throws Exception {
		Tracker t = new Tracker();
		int valueToTest = t.AlertContactsNetwork();
		assertTrue(valueToTest > 5);
	}

}
