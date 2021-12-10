package Domain;

public class Schedule {

	protected int Id;
	private String Date;

	public Schedule() {
	}

	public Schedule(String Date) {
	}

	public void getVaccinesSupplyForecast() {
	}

	public void getVaccinationGuidelines() {
	}

	public void getCitizensInformation() {
	}

	public String getDate() {
		return this.Date;
	}

	public void setDate(String Date) {
		this.Date = Date;
	}
	public int insertScheduleInDB(Schedule s) {
		return 0;
	}

	public int updateScheduleInDB(Schedule s) {
		return 0;
	}

	public int deleteScheduleInDB(Schedule s) {		
		return 0;
	}

	public Schedule readSchedulesInDB() {		
		return null;
	}
	
	public Schedule[] readAllSchedulesInDB() {		
		return null;
	}

}