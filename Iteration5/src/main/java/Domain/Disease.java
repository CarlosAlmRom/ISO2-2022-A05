package Domain;

public class Disease {

	private String DiseaseName;
	private String[] sympthoms;
	private String[] seasonality;
	private String[] medicines;
	private boolean possibleConfinement;

	/*Constructor 1*/
	public Disease() {
	
	}

	/*Constructor 2*/
	public Disease(String DiseaseName) {
		this.DiseaseName = DiseaseName;
	}

	//Gets the name of disease
	public String getDiseaseName() {
		return DiseaseName;
	}

	//Sets the name of the disease
	public void setDiseaseName(String DiseaseName) {
		this.DiseaseName = DiseaseName;
	}

	//Gets the sympthoms of disease
	public String[] getSympthoms() {
		return this.sympthoms;
	}

	//Sets the sympthoms disease can have
	public void setSympthoms(String[] sympthoms) {
		this.sympthoms = sympthoms;
	}

	//Gets when is frequent to have the disease
	public String[] getSeasonality() {
		return this.seasonality;
	}

	//Sets when is frequent to have the disease, can be more than one season
	public void setSeasonality(String[] seasonality) {
		this.seasonality = seasonality;
	}

	//Gets the medicines available for the disease
	public String[] getMedicines() {
		return this.medicines;
	}

	//Sets the medicines available for the disease
	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}

	//Returns if it is possible to confine people with the disease
	public boolean getPossibleConfinement() {
		return this.possibleConfinement;
	}

	//Sets if it is possible to confine people with the disease
	public void setPossibleConfinement(boolean possibleConfinement) {
		this.possibleConfinement = possibleConfinement;
	}

}