package Domain;
/**
 * @author Daniel Max Samson Samson and Antonio Mateo Frances
 * @version 0.0.0
 */
public class Person {

	private String Name;
	private String Surname;
	private String State;
	private Person[] Contacts;
	
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
	public String getState() {
		return State;
	}
	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		State = state;
	}
	/**
	 * 
	 * @return Contacts
	 */
	public Person[] getContacts() {
		return Contacts;
	}
	/**
	 * 
	 * @param contacts
	 */
	public void setContacts(Person[] contacts) {
		Contacts = contacts;
	}

}