package Domain;

/**
 * User class defines the variable Id as int variable, Password, Name and Surname as String variables, then the User method defines 
 * an example of Person, has a LogIn() method and the getters and setters of the class have been generated.
 * @author: Carlos Almodóvar Román
 * @version: 0.0.0
 */

public class User {
	public int Id;
	private String Password;
	public String Name;
	public String Surname;
	
	public User() {
		setId(642);
		setPassword("1234");
		setName("User1");
		setSurname("SurnameUser");
	}
	
	/**
	 * @throws Exception
	 */
	public static void LogIn() throws Exception{
        
    }
	
	/**
	 * @return Id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return Password
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		Password = password;
	}

	/**
	 * @return
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
	
}
