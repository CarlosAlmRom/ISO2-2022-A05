package Domain;
/**
 * @author Daniel Max Samson Samson and Antonio Mateo Frances
 * @version 0.0.0
 *
 */
public class Campaign {

	private String Name;
	private int cost;
	private String date;
	private int effectiveness;
	private int associatedDisease;

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

	public int insertCampaignInDB() {
		// TODO - implement Campaign.insertCampaignInDB
		throw new UnsupportedOperationException();
	}

	public int updateCampaignInDB() {
		// TODO - implement Campaign.updateCampaignInDB
		throw new UnsupportedOperationException();
	}

	public int deleteCampaignInDB() {
		// TODO - implement Campaign.deleteCampaignInDB
		throw new UnsupportedOperationException();
	}

	public Campaign[] readAllCampaignsInDB() {
		// TODO - implement Campaign.readAllCampaignsInDB
		throw new UnsupportedOperationException();
	}

	public Campaign readCampaignsInDB() {
		// TODO - implement Campaign.readCampaignsInDB
		throw new UnsupportedOperationException();
	}

	public int getAssociatedDisease() {
		return this.associatedDisease;
		}

	/**
	 * 
	 * @param associatedDisease
	 */
	public void setAssociatedDisease(int associatedDisease) {
		this.associatedDisease = associatedDisease;
	}

}