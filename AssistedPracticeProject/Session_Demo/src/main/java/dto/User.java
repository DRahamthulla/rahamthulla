package dto;

public class User {
	private String Fname;
	private String lname; 
	private String email; 
	private Integer age; 
	private Long Contact; 
	private String city ; 
	
    public User() {
    	
    }

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		this.Fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email; 
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer i) {
		this.age = i;
	}

	 
	public Long getContact() {
		return Contact;
	}

	public void setContact(Long  contact) {
		this.Contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [fname=" + Fname + ", lname=" + lname + ", email=" + email + ", age=" + age + ", Contact="
				+ Contact + ", city=" + city + "]";
	}
	 

} 
 