package Domain;

/**
 * @author Álvaro Ruiz Roldán and Antonio Mateo Frances
 * @version 0.0.0
 *
 */

public class Disease {

	private String DiseaseName;
	private String[] sympthoms;
	private String[] seasonality;
	private String[] medicines;
	private boolean possibleConfinement;
	// private ArrayList<Campaign> campaings; in future releases
	private boolean DatabaseMatch; // to test a match

	public Disease(String DiseaseName) {
		setSympthoms(null);
		setSeasonality(null);
		setMedicines(null);
		setPossibleConfinement(false);
		DatabaseMatch = false;
	}

	/**
	 * 
	 * @return DiseaseName
	 */

	public String GetName() {
		return DiseaseName;
	}

	/**
	 * 
	 * @param Name
	 */

	public void SetName(String name) {
		this.DiseaseName = name;
	}

	/**
	 * 
	 * @param dis
	 */

	public boolean existsInDatabase(Disease dis) {
		return dis.DatabaseMatch;
	}

	/**
	 * 
	 * @return sympthoms
	 */

	public String[] getSympthoms() {
		return this.sympthoms;
	}

	/**
	 * 
	 * @param sympthoms
	 */

	public void setSympthoms(String[] sympthoms) {
		this.sympthoms = sympthoms;
	}

	/**
	 * 
	 * @return seasonality
	 */

	public String[] getSeasonality() {
		return this.seasonality;
	}

	/**
	 * 
	 * @param seasonality
	 */

	public void setSeasonality(String[] seasonality) {
		this.seasonality = seasonality;
	}

	/**
	 * 
	 * @return medicines
	 */

	public String[] getMedicines() {
		return this.medicines;
	}

	/**
	 * 
	 * @param medicines
	 */

	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}

	/**
	 * 
	 * @return possibleConfinement
	 */

	public boolean getPossibleConfinement() {
		return this.possibleConfinement;
	}

	/**
	 * 
	 * @param possibleConfinement
	 */

	public void setPossibleConfinement(boolean possibleConfinement) {
		this.possibleConfinement = possibleConfinement;
	}

	/*
	 * public ArrayList<Campaign> getCampaings() { return this.campaings; }
	 */

	/**
	 * 
	 * @param DatabaseMatch
	 */

	public void diseaseMatch(Person p, boolean DatabaseMatch) {
		throw new UnsupportedOperationException();
		// database stuff
	}

}
