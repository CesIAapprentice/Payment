package payment;

public class Cheque extends Payment {
	
	private String name, bankID;
	
//-------------------------------------------------------------------------------
// CONSTRUCTOR		

	public Cheque(String id, Integer amount, String name, String bankID) {
		super(id, amount);
		this.name = name;
		this.bankID = bankID;
	}
	
//-------------------------------------------------------------------------------
// METHODS
	
	public boolean authorized() {
		return false;
	}
		
//-------------------------------------------------------------------------------
// GETTERS & SETTERS		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankID() {
		return bankID;
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	
	public String getID() {
		return super.getId();
	}
}