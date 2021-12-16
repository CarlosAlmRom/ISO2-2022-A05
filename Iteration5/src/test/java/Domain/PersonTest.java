package Domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
	public void testGetName() {
		Person p= new Person();
		String nameToTest= "Ismael";
		assertEquals(nameToTest, p.getName());
	}

	@Test
	public void testGetSurname() {
		Person p= new Person();
		String surnameToTest= "Caballero Munioz-Reja";
		assertEquals(surnameToTest, p.getSurname());
}

	@Test
	public void testGetState() {
		Person p= new Person();
		String stateToTest= "Infected";
		assertEquals(stateToTest, p.getState());
	}

}
