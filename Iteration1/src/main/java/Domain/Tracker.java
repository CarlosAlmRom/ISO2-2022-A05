package Domain;
import Domain.*;
public class Tracker {
	public Tracker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Boolean DetectInfectedPerson() throws Exception{
		Person p = new Person();
		if (p.getState() == State.HEALTHY)
			return false;
		else
			return true;
	}
	
	public static Person ConfinePerson() throws Exception{
		Person p = new Person();
		p.setState(State.SICKINQUARANTINE);
		return p;
	}

	public static Person HospitalizePerson() throws Exception{
		Person p = new Person();
		p.setState(State.HOSPITALIZE);
		return p;
	}
	public static int AlertContactsNetwork() throws Exception{
        return 6;
    }
}