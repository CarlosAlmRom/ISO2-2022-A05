package Persistence;

public class Broker {

	private static Broker agent;

	/**
	 * @author Álvaro Ruiz Roldán and Antonio Mateo Frances
	 * @version 0.0.0
	 * @param SQL
	 */

	public Broker Broker() {
		if (agent == null) {
			agent = new Broker();
		}
		return agent;
	}

	/**
	 * 
	 * @param SQL
	 */

	public boolean select(String SQL) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */

	public int insert(String SQL) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */

	public int delete(String SQL) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SQL
	 */

	public int update(String SQL) {
		throw new UnsupportedOperationException();
	}

}