/**
 *
 */
package ISO2LAB.Iteration2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.*;

public class DiseaseTest1 {

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

	@Before
	public void setUpInsertPerson() throws Exception {
		System.out.println("@Before -> How many times do i appear?");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After -> How many times do i appear?");
	}

	@Test
	public void testDiseaseName() throws Exception {
		Disease d = new Disease("Malaria");
		String nameToTest = "Malaria";
		assertEquals(nameToTest, d.GetName());
	}

	@Test
	public void testexistsInDatabase() throws Exception {
		Disease d = new Disease("Malaria");
		assertFalse(d.existsInDatabase(d));
	}

	@Test
	public void testSympthoms() throws Exception {
        Disease d = new Disease("Malaria");
		assertNull(null, d.getSympthoms());
	}

	@Test
	public void testSeasonality() throws Exception {
		Disease d = new Disease("Malaria");
		assertNull(null, d.getSeasonality());
	}

    @Test
    public void testMedicines(boolean isInQuarantine) throws Exception {
		Disease d = new Disease("Malaria");
		assertNull(null, d.getMedicines());
	}

    @Test
	public void testPossibleConfinement() throws Exception {
        Disease d = new Disease("Malaria");
		assertFalse(d.getPossibleConfinement());
	}
}
