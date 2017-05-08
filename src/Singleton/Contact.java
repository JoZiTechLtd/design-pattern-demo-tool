package Singleton;

public class Contact {

	//Fields
	private String title;
	private String forename;
	private String surname;
	private String phone;
	
	public Contact (String title, String forename, String surname, String phone) {
		this.title = title;
		this.forename = forename;
		this.surname = surname;
		this.phone = phone;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString() {
		return this.title + " " + this.forename + " " + this.surname + " " + this.phone;
	}
	
}
