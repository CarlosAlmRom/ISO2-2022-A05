package Domain;

public class Campaign {

	protected int Id;
	private String Name;
	private String date;
	private Disease associatedDisease;

	public Campaign() {
	}

	public Campaign(String Name, String date, Disease associatedDisease) {

	}

	public String getName() {
		
		return this.Name;
	}

	public void setName(String Name) {
		
		this.Name = Name;
	}

	public String getDate() {
		return this.date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	public Disease getAssociatedDisease() {
		return this.associatedDisease;
	}

	public void setAssociatedDisease(Disease associatedDisease) {
		this.associatedDisease = associatedDisease;
	}

	public int insertCampaignInDB(Campaign c) {
		return 0;
	}

	public int updateCampaignInDB(Campaign c) {
		return 0;
	}

	public int deleteCampaignInDB(Campaign c) {		
		return 0;
	}

	public Campaign readCampaignsInDB() {		
		return null;
	}
	
	public Campaign[] readAllCampaignsInDB() {		
		return null;
	}

}