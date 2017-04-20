package contacts;

public class Contact {
	private Long id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailNumber() {
		return emailNumber;
	}
	public void setEmailNumber(String emailNumber) {
		this.emailNumber = emailNumber;
	}
}
