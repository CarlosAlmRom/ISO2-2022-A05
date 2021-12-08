package Persistence;

public class Broker {

	protected Broker agent;

	public Broker Broker() {
		// TODO - implement Broker.Broker
		throw new UnsupportedOperationException();
	}

	//Gets all info from the DB according to the SQL sentence
	public Object[] readAll(String SQL) {
		// TODO - implement Broker.readAll
		throw new UnsupportedOperationException();
	}

	//Returns if there is a coincidence inside the DB according to our SQL sentence
	public boolean select(String SQL) {
		return true;
	}

	//Inserts on DB and returns the number of rows affected 
	public int insert(String SQL) {
		return 1;
	}

	//Deletes on DB and returns the number of rows affected
	public int delete(String SQL) {
		return 1;
	}

	//Updates on DB and returns the number of rows affected
	public int update(String SQL) {
		return 1;
	}

}