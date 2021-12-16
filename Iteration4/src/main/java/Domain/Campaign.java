package Domain;

/**
 * Campaign class defines the variables Name and Date as String variables, Id as int variable and associatedDisease as Disease,
 * then the Campaign method defines an example of Person, finally the getters and setters of the class have been generated.
 * @author Gonzalo Torres Aparicio
 * @version 0.0.0
 */

public class Campaign {

	protected int Id;
	private String Name;
	private String date;
	private Disease associatedDisease;
	/**
	 * @category Constructor for Campaign class
	 */
	public Campaign() {
	}
	/**
	 * @category Constructor for Campaign class
	 */
	public Campaign(String Name, String date, Disease associatedDisease) {

	}
	/**
	 * @return Name
	 */
	public String getName() {
		
		return this.Name;
	}
	/**
	 * @param Name
	 */
	public void setName(String Name) {
		
		this.Name = Name;
	}
	/**
	 * @return Date
	 */
	public String getDate() {
		return this.date;
	}
	/**
	 * @param Date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return associatedDisease
	 */
	public Disease getAssociatedDisease() {
		return this.associatedDisease;
	}
	/**
	 * @param associatedDisease
	 */
	public void setAssociatedDisease(Disease associatedDisease) {
		this.associatedDisease = associatedDisease;
	}
	/**
	 * @return 0
	 */
	public int insertCampaignInDB(Campaign c) {
		return 0;
	}
	/**
	 * @return 0
	 */
	public int updateCampaignInDB(Campaign c) {
		return 0;
	}
	/**
	 * @return 0
	 */
	public int deleteCampaignInDB(Campaign c) {		
		return 0;
	}
	/**
	 * @return null
	 */
	public Campaign readCampaignsInDB() {		
		return null;
	}
	/**
	 * @return null
	 */
	public Campaign[] readAllCampaignsInDB() {		
		return null;
	}

}