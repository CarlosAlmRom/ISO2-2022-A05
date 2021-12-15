package Domain;

/**
 * @author Álvaro Ruiz Roldán and Antonio Mateo Frances
 * @version 0.0.0
 */

public class Person {

	public String Name;
	public String Surname;
	public State State;
	public Person[] contacts;
	public boolean isInQuarantine;
	public boolean diseaseMatched = false;

	public Person(String Name, String Surname) {
		this.Name = Name;
		this.Surname = Surname;
		setState(State.HEALTHY);
		setContacts(null); // no contacts registered
		setIsInQuarantine(false);
		diseaseMatched = false;
	}

	public Person() {
		setName("Mateo");
		setSurname("Antonio");
		setState(State.HEALTHY);
		setContacts(null); // no contacts registered
		setIsInQuarantine(false);
		diseaseMatched = false;
	}

	/**
	 * 
	 * @return Name
	 */

	public String getName() {
		return Name;
	}

	/**
	 * 
	 * @param name
	 */

	public void setName(String name) {
		Name = name;
	}

	/**
	 * 
	 * @return Surname
	 */

	public String getSurname() {
		return Surname;
	}

	/**
	 * 
	 * @param surname
	 */

	public void setSurname(String surname) {
		Surname = surname;
	}

	/**
	 * 
	 * @return State
	 */

	public State getState() {
		return State;
	}

	/**
	 * 
	 * @param state
	 */

	public void setState(State state) {
		State = state;
	}

	/**
	 * 
	 * @return Contacts
	 */

	public Person[] getContacts() {
		return contacts;
	}

	/**
	 * 
	 * @param contacts
	 */

	public void setContacts(Person[] contacts) {
		contacts = contacts;
	}

	/**
	 * 
	 * @param isInQuarantine
	 */

	public void setIsInQuarantine(boolean isInQuarantine) {
		this.isInQuarantine = isInQuarantine;
	}

	/**
	 * 
	 * @return isInQuarantine
	 */

	public boolean getIsInQuarantine() {
		return this.isInQuarantine;
	}

	/**
	 * 
	 * @return diseaseMatched
	 */

	public boolean getDiseaseMatched() {
		return this.diseaseMatched;
	}

	public int insertPersonInDB() {
		return 1;
	}
}
