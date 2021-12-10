package Domain;

public class Person {

	private String Name;
	private String Surname;
	private State State;
	private Person[] contacts;
	private boolean isInQuarantine;
	private boolean diseaseMatched = false;

	public Person(String Name, String Surname) {
	}

	public Person() {
	}

	public void getInformation() {
	}

	public State getState() {
		return this.State;
	}

	public void setState(State State) {
		this.State = State;
	}

	public String getName() {
		return this.Name;
	}

	public String getSurname() {
		return this.Surname;
	}

	public Person[] getContacts() {
		return this.contacts;
	}

	public boolean getIsInQuarantine() {
		return this.isInQuarantine;
	}

	public void setIsInQuarantine(boolean isInQuarantine) {
		this.isInQuarantine = isInQuarantine;
	}

	public boolean getDiseaseMatched() {
		return this.diseaseMatched;
	}

	public void setDiseaseMatched(boolean diseaseMatched) {
		this.diseaseMatched = diseaseMatched;
	}

}