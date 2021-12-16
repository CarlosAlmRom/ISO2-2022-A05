package Domain;

/**
 * Person class defines the variables Name and Surname as String variables, State as State variable, isInQuarantine and diseaseMatched as booleans variables and Person[] as an array of Contacts,
 * then the Person method defines an example of Person, finally the getters and setters of the class have been generated.
 * @author Gonzalo Torres Aparicio
 * @version 0.0.0
 */

public class Person {

	private String Name;
	private String Surname;
	private State State;
	private Person[] contacts;
	private boolean isInQuarantine;
	private boolean diseaseMatched = false;
	/**
	 * Constructor for Person class
	 */
	public Person(String Name, String Surname) {
	}
	/**
	 * Constructor for Person class
	 */
	public Person() {
	}
	
	public void getInformation() {
	}
	/**
	 * @return State
	 */
	public State getState() {
		return this.State;
	}
	/**
	 * @param State
	 */
	public void setState(State State) {
		this.State = State;
	}
	/**
	 * @return Name
	 */
	public String getName() {
		return this.Name;
	}
	/**
	 * @return Surname
	 */
	public String getSurname() {
		return this.Surname;
	}
	/**
	 * @return contacts
	 */
	public Person[] getContacts() {
		return this.contacts;
	}
	/**
	 * @return isInQuarantine
	 */
	public boolean getIsInQuarantine() {
		return this.isInQuarantine;
	}
	/**
	 * @param isInQuarantine
	 */
	public void setIsInQuarantine(boolean isInQuarantine) {
		this.isInQuarantine = isInQuarantine;
	}
	/**
	 * @return diseaseMatched
	 */
	public boolean getDiseaseMatched() {
		return this.diseaseMatched;
	}
	/**
	 * @param diseaseMatched
	 */
	public void setDiseaseMatched(boolean diseaseMatched) {
		this.diseaseMatched = diseaseMatched;
	}

}