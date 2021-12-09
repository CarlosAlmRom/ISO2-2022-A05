package ISO2LAB.Iteration1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.*;

public class UserTest {

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
	public void testState() throws Exception {
		User u = new User();
		int idToTest = 642;
		assertEquals(idToTest, u.getId());
	}
	
	@Test
	public void testPassword() throws Exception {
		User u = new User();
		String passwordToTest = "1234";
		assertEquals(passwordToTest, u.getPassword());
	}

	@Test
	public void testGetName() throws Exception {
		User u = new User();
		String nameToTest = "User1";
		assertEquals(nameToTest, u.getName());
	}
	
	@Test
	public void testGetSurname() throws Exception {
		User u = new User();
		String surnameToTest = "SurnameUser";
		assertEquals(surnameToTest, u.getSurname());
	}

}
