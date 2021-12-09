package Domain;

public class Campaign {

	private String Name;
	private int cost;
	private String date;
	private int effectiveness;
	private Disease associatedDisease;

	public Campaign() {
		//Constructor
	}

	//Sets the name of campaign
	public String getName() {
		// TODO - implement Campaign.getName
		throw new UnsupportedOperationException();
	}

	//Sets the name of campaign
	public void setName(String Name) {
		this.Name = Name;
	}

	//Get the campaign cost
	public int getCost() {
		return this.cost;
	}

	//Set the campaign cost
	public void setCost(int cost) {
		this.cost = cost;
	}

	//Set the campaign creation date
	public String getDate() {
		return this.date;
	}

	//Set the campaign creation date
	public void setDate(String date) {
		this.date = date;
	}

	//Gets the amount of effectiveness of the campaign
	public int getEffectiveness() {
		return this.effectiveness;
	}

	//Sets the amount of effectiveness of the campaign
	public void setEffectiveness(int effectiveness) {
		this.effectiveness = effectiveness;
	}

	//Inserts a campaign from DB, returning the rows affected
	public int insertCampaignInDB(Campaign c) {
		// TODO - implement Campaign.insertCampaignInDB
		return 0;
	}

	//Updates a campaign from DB, returning the rows affected
	public int updateCampaignInDB(Campaign c) {
		// TODO - implement Campaign.updateCampaignInDB
		return 0;
	}

	//Deletes a campaign from DB, returning the rows affected
	public int deleteCampaignInDB(Campaign c) {
		// TODO - implement Campaign.deleteCampaignInDB
		return 0;
	}

	//Read and get all campagins in the DB
	public Campaign[] readAllCampaignsInDB() {
		// TODO - implement Campaign.readAllCampaignsInDB
		return null;
	}

	//Read and get campaign in the DB
	public Campaign readCampaignsInDB() {
		// TODO - implement Campaign.readCampaignsInDB
		return null;
	}

	//Gets the disease that represents the campaign
	public Disease getAssociatedDisease() {
		return this.associatedDisease;
	}

	//Sets a concrete disease to represent the campaign
	public void setAssociatedDisease(Disease associatedDisease) {
		this.associatedDisease = associatedDisease;
	}

}
