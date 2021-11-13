package contact;

// Contact Class Requirements
// The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updateable.
// The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
// The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
// The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
// The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.

//Name String Variables

public class ContactClass {

	private String ID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

// Parameterized constructor

	public ContactClass(String ID, String firstName, String lastName, String phoneNumber, String address) {
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(phoneNumber == null || phoneNumber.length()>10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		// Invoking the parent class constructor
        // with the usage of super() word
				
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;

	}
	
	// May Not need the setters for this????
// Accessors and Mutators
// Getters and Setters

// Getter for ContactID
	public String getID() {
		return ID;
	}

// Setter for ContactID
	public void setID(String ID) {
		this.ID = ID;
	}
	
// Getter for firstName
	public String getFirstName() {
		return firstName;
	}

// Setter for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

// Getter for lastName
	public String getLastName() {
		return lastName;
	}

// Setter for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

// Getter for PhoneNumber
	public String getPhoneNumber() {
		return phoneNumber;
	}

// Setter for PhoneNumber
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

// Getter for Address
	public String getAddress() {
		return address;
	}

// Setter for Address
	public void setAddress(String address) {
		this.address = address;
	}

// Check if the two contacts are the same or not.

//	@Override
//	public String toString() {
//		return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName
//				+ ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
//	}
}