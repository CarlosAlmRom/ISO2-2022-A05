package ISO2LAB.Iteration4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.Campaign;
import Domain.Disease;

public class CampaignTestEmptyString {

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
		Campaign c = new Campaign();
		c.setName("");
		String nameToTest = "";
		assertEquals(nameToTest, c.getName());
	}


	@Test
	public void testGetDate() {
		Campaign c = new Campaign();
		c.setDate("");
		String dateToTest = "";
		assertEquals(dateToTest, c.getDate());
	}

	@Test
	public void testGetAssociatedDisease() {
		Campaign c = new Campaign();
		Disease d = new Disease("");
		c.setAssociatedDisease(d);
		String associatedDiseaseToTest = "";
		assertEquals(associatedDiseaseToTest, c.getAssociatedDisease().getDiseaseName());
	}
	
	@Test
	public void testInsertCampaignInDB() {
		Disease d = new Disease("");
		Campaign c = new Campaign();
		c.setName("");
		c.setAssociatedDisease(d);
		c.setDate("");
		c.setAssociatedDisease(null);
		int rows_affected = c.insertCampaignInDB(c);
		assertEquals(0, rows_affected);
	}

	@Test
	public void testUpdateCampaignInDB() {
		Disease d = new Disease("");
		Campaign c = new Campaign();
		c.setName("");
		c.setAssociatedDisease(d);
		c.setDate("");
		c.setAssociatedDisease(null);
		int rows_affected = c.updateCampaignInDB(c);
		assertEquals(0, rows_affected);
	}

	@Test
	public void testDeleteCampaignInDB() {
		Disease d = new Disease("");
		Campaign c = new Campaign();
		c.setName("");
		c.setAssociatedDisease(d);
		c.setDate("");
		c.setAssociatedDisease(null);
		int rows_affected = c.deleteCampaignInDB(c);
		assertEquals(0, rows_affected);
	}

	@Test
	public void testReadCampaignsInDB() {
		Campaign c = new Campaign();
    	assertEquals(null, c.readAllCampaignsInDB());
	}

	@Test
	public void testReadAllCampaignsInDB() {
		Campaign c = new Campaign();
    	assertEquals(null, c.readCampaignsInDB());
	}

}