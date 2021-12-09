package Domain;

public class Disease {

	private String DiseaseName;
	private String[] sympthoms;
	private String[] seasonality;
	private String[] medicines;
	private boolean possibleConfinement;
	//private ArrayList<Campaign> campaings; in future releases
	private boolean DatabaseMatch; //to test a match

	public Disease(String DiseaseName) {
		setSympthoms(null);
		setSeasonality(null);
		setMedicines(null);
		setPossibleConfinement(false);
		DatabaseMatch = false;
	}

	public String GetName() {
		return DiseaseName;
	}

	public void SetName(String name) {
		this.DiseaseName = name;
	}

	public boolean existsInDatabase(Disease dis) {
		return dis.DatabaseMatch;
	}

	public String[] getSympthoms() {
		return this.sympthoms;
	}

	public void setSympthoms(String[] sympthoms) {
		this.sympthoms = sympthoms;
	}

	public String[] getSeasonality() {
		return this.seasonality;
	}

	public void setSeasonality(String[] seasonality) {
		this.seasonality = seasonality;
	}

	public String[] getMedicines() {
		return this.medicines;
	}

	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}

	public boolean getPossibleConfinement() {
		return this.possibleConfinement;
	}

	public void setPossibleConfinement(boolean possibleConfinement) {
		this.possibleConfinement = possibleConfinement;
	}

	/*public ArrayList<Campaign> getCampaings() {
		return this.campaings;
	}*/

	public void diseaseMatch(Person p, boolean DatabaseMatch) {
		throw new UnsupportedOperationException();
		//database stuff
	}

}


