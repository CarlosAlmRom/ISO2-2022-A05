package Domain;

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
	public static void LogIn() throws Exception{
        
    }
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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

	
}

