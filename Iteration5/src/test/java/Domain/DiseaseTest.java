package Domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiseaseTest {

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
	public void testGetDiseaseName() {
		Disease d= new Disease();
		String diseasenameToTest= "Ismale";
		assertEquals(diseasenameToTest, d.getDiseaseName());
	}

	@Test
	public void testGetSymptoms() {
		Disease d= new Disease();
		String[] symptomsToTest= {"nausea"};
		assertEquals(symptomsToTest[1], d.getSymptoms());
	}

	@Test
	public void testGetSeasonality() {
		Disease d= new Disease();
		String[] seasonalityToTest= {"Something"};
		assertEquals(seasonalityToTest[1], d.getSeasonality());
	}

	@Test
	public void testGetMedicines() {
		Disease d= new Disease();
		String[] medicinesToTest= {"Paracetamol"};
		assertEquals(medicinesToTest[1], d.getMedicines());
	}

	@Test
	public void testIsPossibleConfinement() {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetPossibleConfinement() {
		throw new RuntimeException("not yet implemented");
	}


}
