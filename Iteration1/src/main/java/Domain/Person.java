package Domain;

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
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
		return Contacts;
	}
	public void setContacts(Person[] contacts) {
		Contacts = contacts;
	}
}
