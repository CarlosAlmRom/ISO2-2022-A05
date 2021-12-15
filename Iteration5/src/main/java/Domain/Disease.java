package Domain;
/**
 * 
 * @author Daniel Max Samson Samson and Antonio Mateo Frances
 * @version 0.0.0
 *
 */
public class Disease {

	private String DiseaseName;
	private String[] symptoms;
	private String[] seasonality;
	private String[] medicines;
	private boolean possibleConfinement;

	
	public String getDiseaseName() {
		return DiseaseName;
	}


	/**
	 * 
	 * @param diseaseName
	 */
	public void setDiseaseName(String diseaseName) {
		DiseaseName = diseaseName;
	}


	/**
	 * 
	 * @return
	 */
	public String[] getSymptoms() {
		return symptoms;
	}


	/**
	 * 
	 * @param symptoms
	 */
	public void setSymptoms(String[] symptoms) {
		this.symptoms = symptoms;
	}


	/**
	 * 
	 * @return
	 */
	public String[] getSeasonality() {
		return seasonality;
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
	 * @return
	 */
	public String[] getMedicines() {
		return medicines;
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
	 * @return
	 */
	public boolean isPossibleConfinement() {
		return possibleConfinement;
	}


	/**
	 * 
	 * @param possibleConfinement
	 */
	public void setPossibleConfinement(boolean possibleConfinement) {
		this.possibleConfinement = possibleConfinement;
	}

	

}