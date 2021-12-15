package Domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CampaignTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
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
		Campaign c= new Campaign();
		String nameToTest= "Covid19";
		assertEquals(nameToTest, c.getName());
		}

	@Test
	public void testGetCost() {
		Campaign c= new Campaign();
		int costToTest= 10000;
		assertEquals(costToTest, c.getCost());
	}

	@Test
	public void testGetDate() {
		Campaign c= new Campaign();
		String dateToTest= "21/09/2019";
		assertEquals(dateToTest, c.getDate());
	}

	@Test
	public void testGetEffectiveness() {
		Campaign c= new Campaign();
		int effectivenessToTest= 99;
		assertEquals(effectivenessToTest, c.getEffectiveness());

	}

	@Test
	public void testGetAssociatedDisease() {
		Campaign c= new Campaign();
		int associatedDiseaseToTest= 1;
		assertEquals(associatedDiseaseToTest, c.getAssociatedDisease());
	}

}
