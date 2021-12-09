package Persistence;

public class Broker {

	private static Broker agent;

	public Broker Broker() {
		if(agent == null) {
			agent = new Broker();
		}
		return agent;
	}

	public boolean select(String SQL) {
		throw new UnsupportedOperationException();
	}

	public int insert(String SQL) {
		throw new UnsupportedOperationException();
	}

	public int delete(String SQL) {
		throw new UnsupportedOperationException();
	}

	public int update(String SQL) {
		throw new UnsupportedOperationException();
	}

}