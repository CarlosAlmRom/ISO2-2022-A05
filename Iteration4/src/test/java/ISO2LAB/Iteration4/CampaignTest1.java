package ISO2LAB.Iteration4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.Campaign;
import Domain.Disease;
/**
 * Testing class for Campaign.java, the class test some variables from Campaign.java
 * @author Gonzalo Torres Aparicio
 * @version 1.0.0
 */
public class CampaignTest1 {
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
     * Auto-generated method modified to test what happens if we enter a normal string in variables from Schedule.java
     */
	@Test
	public void testGetName() {
		Campaign c = new Campaign();
		c.setName("COVID-19 Campaign");
		String nameToTest = "COVID-19 Campaign";
		assertEquals(nameToTest, c.getName());
	}

	/**
     * Auto-generated method modified to test what happens if we enter a normal string in variables from Schedule.java
     */
	@Test
	public void testGetDate() {
		Campaign c = new Campaign();
		c.setDate("21/11/2021");
		String dateToTest = "21/11/2021";
		assertEquals(dateToTest, c.getDate());
	}
	/**
     * Auto-generated method modified to test what happens if we enter a normal string in variables from Schedule.java
     */
	@Test
	public void testGetAssociatedDisease() {
		Campaign c = new Campaign();
		Disease d = new Disease("COVID-19");
		c.setAssociatedDisease(d);
		String associatedDiseaseToTest = "COVID-19";
		assertEquals(associatedDiseaseToTest, c.getAssociatedDisease().getDiseaseName());
	}
	/**
     * Auto-generated method modified to test what happens if we enter a normal string in variables from Schedule.java
     */
	@Test
	public void testInsertCampaignInDB() {
		Disease d = new Disease("COVID-19");
		Campaign c = new Campaign();
		c.setName("COVID-19");
		c.setAssociatedDisease(d);
		c.setDate("21/11/2021");
		c.setAssociatedDisease(null);
		int rows_affected = c.insertCampaignInDB(c);
		assertEquals(0, rows_affected);
	}
	/**
     * Auto-generated method modified to test what happens if we enter a normal string in variables from Schedule.java
     */
	@Test
	public void testUpdateCampaignInDB() {
		Disease d = new Disease("COVID-19");
		Campaign c = new Campaign();
		c.setName("COVID-19");
		c.setAssociatedDisease(d);
		c.setDate("21/11/2021");
		c.setAssociatedDisease(null);
		int rows_affected = c.updateCampaignInDB(c);
		assertEquals(0, rows_affected);
	}
	/**
     * Auto-generated method modified to test what happens if we enter a normal string in variables from Schedule.java
     */
	@Test
	public void testDeleteCampaignInDB() {
		Disease d = new Disease("COVID-19");
		Campaign c = new Campaign();
		c.setName("COVID-19");
		c.setAssociatedDisease(d);
		c.setDate("21/11/2021");
		c.setAssociatedDisease(null);
		int rows_affected = c.deleteCampaignInDB(c);
		assertEquals(0, rows_affected);
	}
	/**
     * Auto-generated method modified to test what happens if we enter a normal string in variables from Schedule.java
     */
	@Test
	public void testReadCampaignsInDB() {
		Campaign c = new Campaign();
    	assertEquals(null, c.readAllCampaignsInDB());
	}
	/**
     * Auto-generated method modified to test what happens if we enter a normal string in variables from Schedule.java
     */
	@Test
	public void testReadAllCampaignsInDB() {
		Campaign c = new Campaign();
    	assertEquals(null, c.readCampaignsInDB());
	}

}
