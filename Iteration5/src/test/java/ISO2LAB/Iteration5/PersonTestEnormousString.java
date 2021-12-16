/**
 *
 */
package ISO2LAB.Iteration5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.*;

public class PersonTestEnormousString {

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
	public void testGetName() throws Exception {
		Person p = new Person("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa", "shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		String nameToTest = "Lionel";
		assertEquals(nameToTest, p.getName());
	}

	@Test
	public void testGetSurname() throws Exception {
		Person p = new Person("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa","shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		String surnameToTest = "Messi";
		assertEquals(surnameToTest, p.getSurname());
	}

	@Test
	public void testState() throws Exception {
		Person p = new Person();
		State stateToTest = State.HEALTHY;
		assertEquals(stateToTest, p.getState());
	}

	@Test
	public void testContacts() throws Exception {
		Person p = new Person();
		assertNull(null, p.getContacts());
	}

    @Test
    public void testIsInQuarantine(boolean isInQuarantine) throws Exception {
		Person p = new Person(); //by default quarantine is false
		assertFalse(p.getIsInQuarantine());
	}

    @Test
	public void testDiseaseMatched() throws Exception {
        Person p = new Person(); //by default diseaseMatched is false
		assertFalse(p.getDiseaseMatched());
	}

}
