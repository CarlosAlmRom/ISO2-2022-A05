package Domain;

public class Campaign {

	private String Name;
	private int cost;
	private String date;
	private int effectiveness;
	private Disease associatedDisease;

	public Campaign() {
        //TODO - implement constructor
	}

	public String getName() {
		// TODO - implement Campaign.getName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Name
	 */
	public void setName(String Name) {
		// TODO - implement Campaign.setName
		throw new UnsupportedOperationException();
	}

	public int getCost() {
		return this.cost;
	}

	/**
	 * 
	 * @param cost
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	public int getEffectiveness() {
		return this.effectiveness;
	}

	/**
	 * 
	 * @param effectiveness
	 */
	public void setEffectiveness(int effectiveness) {
		this.effectiveness = effectiveness;
	}

	public int insertCampaignInDB(Campaign c) {
		return 1;
	}

	public int updateCampaignInDB(Campaign c) {
		return 1;
	}

	public int deleteCampaignInDB(Campaign c) {
		return 1;
	}

	public Campaign[] readAllCampaignsInDB() {
		return null;
	}

	public Campaign readCampaignsInDB() {
		return null;
	}

	public Disease getAssociatedDisease() {
		return this.associatedDisease;
	}

	/**
	 * 
	 * @param associatedDisease
	 */
	public Disease setAssociatedDisease(Disease associatedDisease) {
		return this.associatedDisease = associatedDisease;
	}

}
