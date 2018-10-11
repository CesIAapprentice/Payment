package payment;

public class Credit extends Payment {
	
	private String number, name, expDate;
	
//-------------------------------------------------------------------------------
// CONSTRUCTOR	
	
	public Credit(String id, Integer amount, String number, String name, String expDate) {
		super(id, amount);
		this.number = number;
		this.name = name;
		this.expDate = expDate;
	}
	
//-------------------------------------------------------------------------------
// METHODS
	
	public boolean authorized() {
		return true;
	}
	
//-------------------------------------------------------------------------------
// GETTERS & SETTERS
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	

	
}
