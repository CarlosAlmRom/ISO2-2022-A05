package ISO2LAB.Iteration4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.Campaign;
import Domain.Disease;
import Domain.Schedule;

public class ScheduleTest1 {

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
	public void testGetVaccinesSupplyForecast() {
		
	}

	@Test
	public void testGetVaccinationGuidelines() {
		
	}

	@Test
	public void testGetCitizensInformation() {
		
	}

	@Test
	public void testGetDate() {
		Schedule s = new Schedule();
		s.setDate("COVID-19 Schedule");
		String nameToTest = "COVID-19 Schedule";
		assertEquals(nameToTest, s.getDate());
	}
	
	@Test
	public void testInsertScheduleInDB() {
		Schedule s = new Schedule();
		s.setDate("21/11/2021");
		int rows_affected = s.insertScheduleInDB(s);
		assertEquals(0, rows_affected);
	}

	@Test
	public void testUpdateScheduleInDB() {
		Schedule s = new Schedule();
		s.setDate("21/11/2021");
		int rows_affected = s.updateScheduleInDB(s);
		assertEquals(0, rows_affected);
	}

	@Test
	public void testDeleteScheduleInDB() {
		Schedule s = new Schedule();
		s.setDate("21/11/2021");
		int rows_affected = s.deleteScheduleInDB(s);
		assertEquals(0, rows_affected);
	}

	@Test
	public void testReadSchedulesInDB() {
		Schedule s = new Schedule();
    	assertEquals(null, s.readAllSchedulesInDB());
	}

	@Test
	public void testReadAllSchedulesInDB() {
		Schedule s = new Schedule();
    	assertEquals(null, s.readSchedulesInDB());
	}

}
