public class Author {
	
	private final String firstName;
	private final String lastName;
	private final String city;
	
	Author(String first, String last, String city){		
		
		this.firstName = first;
		this.lastName = last;
		this.city = city;	
		
	}

	public String getFirstName() {
		return firstName;
	}
	

	public String getLastName() {
		return lastName;
	}

	public String getCity() {
		return city;
	}
	
	

}
