/**
 *
 */
package ISO2LAB.Iteration3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Domain.*;

public class CampaignTestEnormousString {

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
	public void testCampaignName() throws Exception {
		Campaign c = new Campaign();
		c.setName("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		String nameToTest="shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa";
		assertEquals(nameToTest, c.getName());
	}

	@Test
	public void testinsertCampaignInDB() throws Exception {
		Campaign c = new Campaign();
		c.setName("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		c.setCost(2000);
		c.setDate("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		c.setEffectiveness(4);
		c.setAssociatedDisease(null);
		int rows_affected = c.insertCampaignInDB(c);
		assertEquals(0, rows_affected);
	}

	@Test
	public void testupdateCampaignInDB() throws Exception {
        Campaign c = new Campaign();
		c.setName("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		c.setCost(2000);
		c.setDate("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		c.setEffectiveness(4);
		c.setAssociatedDisease(null);
		int rows_affected = c.updateCampaignInDB(c);
		assertEquals(0, rows_affected);
	}

	@Test
	public void testdeleteCampaignInDB() throws Exception {
        Campaign c = new Campaign();
		c.setName("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		c.setCost(2000);
		c.setDate("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		c.setEffectiveness(4);
		c.setAssociatedDisease(null);
		int rows_affected = c.deleteCampaignInDB(c);
		assertEquals(0, rows_affected);
	}

    @Test
    public void testreadAllCampaignsInDB() throws Exception {
		Campaign c = new Campaign();
    	assertEquals(0, c.readAllCampaignsInDB());
	}

    @Test
	public void testreadCampaignsInDB() throws Exception {
    	Campaign c = new Campaign();
    	assertEquals(null, c.readCampaignsInDB());
	}

	@Test
	public void testgetAssociatedDisease() throws Exception {
        Campaign c = new Campaign();
		c.setName("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
        c.setCost(2000);
		c.setDate("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		c.setEffectiveness(4);
		c.setAssociatedDisease(new Disease("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa"));
		assertEquals("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa", c.getAssociatedDisease());
	}

    @Test
    public void testgetEffectiveness() throws Exception {
		Campaign c = new Campaign();
		c.setName("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
        c.setCost(2000);
		c.setDate("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
		c.setEffectiveness(4);
		c.setAssociatedDisease(null);
		assertEquals(4, c.getEffectiveness());
	}

    @Test
	public void testgetDate() throws Exception {
        Campaign c = new Campaign();
		c.setName("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
        c.setCost(2000);
		c.setDate("5/12/2021");
		c.setEffectiveness(4);
		c.setAssociatedDisease(null);
        assertEquals("5/12/2021", c.getDate());
	}


    @Test
	public void testgetCost() throws Exception {
        Campaign c = new Campaign();
		c.setName("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
        c.setCost(2000);
        c.setDate("shjfusdifhsufisdhnfuisdhfdsfhunduscjndkscjuvndksvnsujhnsufnhdfusjnhdfjsudbhsjusbfdfksjdbfsfbdsfbdshjfdfkjdhnkjfdsnhfkdhnkfsdnhfkjdsnfkdjsbnfkdnhfdsjnhfkjdshnfdjskfhnkjsdfnkdsnhfksdnhfksdnfkjsdmnfsdjmflksdjflsdjmlfksdfjkldsjflsdfjsmdlfsjmldfjdsmlfjsmdklfjdsmlfnsdfjmsdfjdskjcnjfmcdrkkufgmdfdvdvfdjvfdhjkfdhujfsdhfkdkfajidfsaedjhfsa");
        c.setEffectiveness(4);
		c.setAssociatedDisease(null);
        assertEquals(2000, c.getCost());
	}

}


