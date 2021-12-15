package Domain;
import Domain.*;

/**
 * Tracker class defines the methods DetectInfectedPerson(), ConfinePerson(), HospitalizePerson() and AlertContactsNetwork()
 * @author: Carlos Almodóvar Román
 * @version: 0.0.0
 */

public class Tracker {
	public Tracker() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * If a person is not healthy a True is returned
	 * @return True or False
	 * @throws Exception
	 */
	public static Boolean DetectInfectedPerson() throws Exception{
		Person p = new Person();
		if (p.getState() == State.HEALTHY)
			return false;
		else
			return true;
	}
	
	/**
	 * @return the Person with the State: SICKINQUARANTINE
	 * @throws Exception
	 */
	public static Person ConfinePerson() throws Exception{
		Person p = new Person();
		p.setState(State.SICKINQUARANTINE);
		return p;
	}

	/**
	 * @return the Person with the State: HOSPITALIZE
	 * @throws Exception
	 */
	public static Person HospitalizePerson() throws Exception{
		Person p = new Person();
		p.setState(State.HOSPITALIZE);
		return p;
	}
	/** Alert all the contacts of the Network of the Infected Person 
	 * @return
	 * @throws Exception
	 */
	public static int AlertContactsNetwork() throws Exception{
        return 6;
    }
}