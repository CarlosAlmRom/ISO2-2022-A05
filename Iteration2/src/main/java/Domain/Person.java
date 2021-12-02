package Domain;

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
        setContacts(null); //no contacts registered
        setIsInQuarantine(false);
        diseaseMatched = false;
	}
	
	public Person() {
		setName("Mateo");
		setSurname("Antonio");
		setState(State.HEALTHY);
        setContacts(null); //no contacts registered
        setIsInQuarantine(false);
        diseaseMatched = false;
	}

    public String getName() {
		return Name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public State getState() {
		return State;
	}

	public void setState(State state) {
		State = state;
	}

	public Person[] getContacts() {
		return contacts;
	}

	public void setContacts(Person[] contacts) {
		contacts = contacts;
	}

	public void setIsInQuarantine(boolean isInQuarantine) {
		this.isInQuarantine = isInQuarantine;
	}

	public boolean getIsInQuarantine() {
		return this.isInQuarantine;
	}

	public boolean getDiseaseMatched() {
		return this.diseaseMatched;
	}

	public int insertPersonInDB() {
		return 1;
	}
}
