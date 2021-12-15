package Domain;

/**
 * Person class defines the variables Name and Surname as String variables, State as State variable and Person[] as an array of Contacts,
 * then the Person method defines an example of Person, finally the getters and setters of the class have been generated.
 * @author: Carlos Almodóvar Román
 * @version: 0.0.0
 */

public class Person {
	public String Name;
	public String Surname;
	public State State;
	public Person[] Contacts;
	
	public Person() {
		setName("Lionel");
		setSurname("Messi");
		setState(State.HEALTHY);
		setContacts(null);
	}
	
	/**
	 * @return Name
	 */
	public String getName() {
		return Name;
	}
	
	/**
	 * @param name
	 */
	
	public void setName(String name) {
		Name = name;
	}
	
	/**
	 * @return Surname
	 */
	public String getSurname() {
		return Surname;
	}
	
	/**
	 * @param surname
	 */
	public void setSurname(String surname) {
		Surname = surname;
	}
	
	/**
	 * @return State
	 */
	public State getState() {
		return State;
	}
	
	/**
	 * @param state
	 */
	public void setState(State state) {
		State = state;
	}
	
	/**
	 * @return Contacts
	 */
	public Person[] getContacts() {
		return Contacts;
	}
	
	/**
	 * @param contacts
	 */
	public void setContacts(Person[] contacts) {
		Contacts = contacts;
	}
}
