package Domain;
/**
 * Disease class defines the variables DiseaseName String variable, sympthoms, seasonality, medicines as arrayof Strings and possibleConfinement as boolean variable,
 * then the Person method defines an example of Person, finally the getters and setters of the class have been generated.
 * @author Gonzalo Torres Aparicio
 * @version 0.0.0
 */
public class Disease {

	private String DiseaseName;
	private String[] sympthoms;
	private String[] seasonality;
	private String[] medicines;
	private boolean possibleConfinement;

	/**
	 * @category Constructor for Disease class
	 */
	public Disease(String DiseaseName) {
		this.DiseaseName = DiseaseName;
	}
	/**
	 * @category Constructor for Disease class
	 */
	public Disease() {
	}
	/**
	 * @return DiseaseName
	 */
	public String getDiseaseName() {
		return this.DiseaseName;
	}
	/**
	 * @return sympthoms
	 */
	public String[] getSympthoms() {
		return this.sympthoms;
	}
	/**
	 * @return seasonality
	 */
	public String[] getSeasonality() {
		return this.seasonality;
	}
	/**
	 * @return medicines
	 */
	public String[] getMedicines() {
		return this.medicines;
	}
	/**
	 * @return possibleConfinement
	 */
	public boolean getPossibleConfinement() {
		return this.possibleConfinement;
	}
	/**
	 * @param possibleConfinement
	 */
	public void setPossibleConfinement(boolean possibleConfinement) {
		this.possibleConfinement = possibleConfinement;
	}
	/**
	 * @param medicines
	 */
	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}
	/**
	 * @param sympthoms
	 */
	public void setSympthoms(String[] sympthoms) {
		this.sympthoms = sympthoms;
	}
	/**
	 * @param DiseaseName
	 */
	public void setDiseaseName(String DiseaseName) {
		this.DiseaseName = DiseaseName;
	}
	/**
	 * @param seasonality
	 */
	public void setSeasonality(String[] seasonality) {
		this.seasonality = seasonality;
	}

}