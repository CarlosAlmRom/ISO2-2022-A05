package Domain;

public class Disease {

	private String DiseaseName;
	private String[] sympthoms;
	private String[] seasonality;
	private String[] medicines;
	private boolean possibleConfinement;


	public Disease(String DiseaseName) {
		this.DiseaseName = DiseaseName;
	}

	public Disease() {
	}

	public String getDiseaseName() {
		return this.DiseaseName;
	}

	public String[] getSympthoms() {
		return this.sympthoms;
	}

	public String[] getSeasonality() {
		return this.seasonality;
	}

	public String[] getMedicines() {
		return this.medicines;
	}

	public boolean getPossibleConfinement() {
		return this.possibleConfinement;
	}

	public void setPossibleConfinement(boolean possibleConfinement) {
		this.possibleConfinement = possibleConfinement;
	}

	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}

	public void setSympthoms(String[] sympthoms) {
		this.sympthoms = sympthoms;
	}

	public void setDiseaseName(String DiseaseName) {
		this.DiseaseName = DiseaseName;
	}

	public void setSeasonality(String[] seasonality) {
		this.seasonality = seasonality;
	}

}