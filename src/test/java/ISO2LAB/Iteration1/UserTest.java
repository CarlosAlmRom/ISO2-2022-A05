package ISO2LAB.Iteration1;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.*;

/**
 * Testing class for User.java, the class test some variables from User.java
 * @author: Carlos Almodóvar Román
 * @version: 1.0.0
 */

public class UserTest {
	
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
     * Auto-generated method modified to test the variable Id from User.java
     */
	@Test
	public void testId() throws Exception {
		User u = new User();
		int idToTest = 642;
		assertEquals(idToTest, u.getId());
	}

	/**
     * Auto-generated method modified to test the variable Password from User.java
     */
	@Test
	public void testPassword() throws Exception {
		User u = new User();
		String passwordToTest = "1234";
		assertEquals(passwordToTest, u.getPassword());
	}

	/**
     * Auto-generated method modified to test the variable Name from User.java
     */
	@Test
	public void testGetName() throws Exception {
		User u = new User();
		String nameToTest = "User1";
		assertEquals(nameToTest, u.getName());
	}

	/**
     * Auto-generated method modified to test the variable Surname from User.java
     */
	@Test
	public void testGetSurname() throws Exception {
		User u = new User();
		String surnameToTest = "SurnameUser";
		assertEquals(surnameToTest, u.getSurname());
	}

}
