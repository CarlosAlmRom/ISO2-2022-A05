package Domain;

/**
 * Schedule class defines the variables Date as String variable and Id as int variable,
 * then the Person method defines an example of Person, finally the getters and setters of the class have been generated.
 * @author Gonzalo Torres Aparicio
 * @version 0.0.0
 */

public class Schedule {

	protected int Id;
	private String Date;
	/**
	 * @category Constructor for Schedule class
	 */
	public Schedule() {
	}
	/**
	 * @category Constructor for Schedule class
	 */
	public Schedule(String Date) {
	}
	/**
	 * @category Method on Schedule class
	 */
	public void getVaccinesSupplyForecast() {
	}
	/**
	 * @category Method on Schedule class
	 */
	public void getVaccinationGuidelines() {
	}
	/**
	 * @category Method on Schedule class
	 */
	public void getCitizensInformation() {
	}
	/**
	 * @return Date
	 */
	public String getDate() {
		return this.Date;
	}
	/**
	 * @param Date
	 */
	
	public void setDate(String Date) {
		this.Date = Date;
	}
	/**
	 * @return 0
	 */
	public int insertScheduleInDB(Schedule s) {
		return 0;
	}
	/**
	 * @return 0
	 */
	public int updateScheduleInDB(Schedule s) {
		return 0;
	}
	/**
	 * @return 0
	 */
	public int deleteScheduleInDB(Schedule s) {		
		return 0;
	}
	/**
	 * @return null
	 */
	public Schedule readSchedulesInDB() {		
		return null;
	}
	/**
	 * @return null
	 */
	public Schedule[] readAllSchedulesInDB() {		
		return null;
	}

}