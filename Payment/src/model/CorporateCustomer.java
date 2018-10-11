package model;

public class CorporateCustomer extends Customer {
	
	private String contact;
	private char creditRating;
	private Integer creditLimit;
	
// ----------------------------------------------------------------
// CONSTRUCTOR	

	public CorporateCustomer(String name, String deliveryAddress, String phone, char creditRating, Integer creditLimit) {
		super(name, deliveryAddress, phone);
		this.creditLimit = creditLimit;
		this.creditRating = creditRating;
	}
	
// ----------------------------------------------------------------
// GETTERS & SETTERS
	
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public char getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(char creditRating) {
		this.creditRating = creditRating;
	}

	public Integer getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Integer creditLimit) {
		this.creditLimit = creditLimit;
	}
}