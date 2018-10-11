package model;

public class PersonalCustomer extends Customer {
	
	private String creditCard;
	
// ----------------------------------------------------------------
// CONSTRUCTOR	

	public PersonalCustomer(String name, String deliveryAddress, String phone, String creditCard) {
		super(name, deliveryAddress, phone);
		this.creditCard = creditCard;
	}
	
// ----------------------------------------------------------------
// GETTERS & SETTERS

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
}