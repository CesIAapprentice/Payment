package payment;

public abstract class Payment {
	
	private Integer amount;
	private String id;
	
//-------------------------------------------------------------------------------
// CONSTRUCTOR		

	public Payment(String id, Integer amount) {
		this.id = id;
		this.amount = amount;
	}
	
//-------------------------------------------------------------------------------
// METHODS	
	
//-------------------------------------------------------------------------------
// GETTERS & SETTERS	

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}