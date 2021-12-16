package ISO2LAB.Iteration4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.Campaign;
import Domain.Schedule;
/**
 * Testing class for Schedule.java, the class test some variables from Schedule.java
 * @author Gonzalo Torres Aparicio
 * @version 1.0.0
 */
public class ScheduleTestEmptyString {
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
     * Auto-generated method
     */
	@Test
	public void testGetVaccinesSupplyForecast() {
		
	}
	/**
     * Auto-generated method
     */
	@Test
	public void testGetVaccinationGuidelines() {
		
	}
	/**
     * Auto-generated method
     */
	@Test
	public void testGetCitizensInformation() {
		
	}
	/**
     * Auto-generated method modified to test what happens if we enter a empty string in variables from Schedule.java
     */
	@Test
	public void testGetDate() {
		Schedule s = new Schedule();
		s.setDate("");
		String nameToTest = "";
		assertEquals(nameToTest, s.getDate());
	}
	/**
     * Auto-generated method modified to test what happens if we enter a empty string in variables from Schedule.java
     */
	@Test
	public void testInsertScheduleInDB() {
		Schedule s = new Schedule();
		s.setDate("");
		int rows_affected = s.insertScheduleInDB(s);
		assertEquals(0, rows_affected);
	}
	/**
     * Auto-generated method modified to test what happens if we enter a empty string in variables from Schedule.java
     */
	@Test
	public void testUpdateScheduleInDB() {
		Schedule s = new Schedule();
		s.setDate("");
		int rows_affected = s.updateScheduleInDB(s);
		assertEquals(0, rows_affected);
	}
	/**
     * Auto-generated method modified to test what happens if we enter a empty string in variables from Schedule.java
     */
	@Test
	public void testDeleteScheduleInDB() {
		Schedule s = new Schedule();
		s.setDate("");
		int rows_affected = s.deleteScheduleInDB(s);
		assertEquals(0, rows_affected);
	}
	/**
     * Auto-generated method modified to test what happens if we enter a empty string in variables from Schedule.java
     */
	@Test
	public void testReadSchedulesInDB() {
		Schedule s = new Schedule();
    	assertEquals(null, s.readAllSchedulesInDB());
	}
	/**
     * Auto-generated method modified to test what happens if we enter a empty string in variables from Schedule.java
     */
	@Test
	public void testReadAllSchedulesInDB() {
		Schedule s = new Schedule();
    	assertEquals(null, s.readSchedulesInDB());
	}

}