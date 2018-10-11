package payment;

public class Cash extends Payment {
	
	private Integer cashTendered;
	
//-------------------------------------------------------------------------------
// CONSTRUCTOR		

	public Cash(String id, Integer amount, Integer cashTendered) {
		super(id, amount);
		this.cashTendered = cashTendered;
	}
	
//-------------------------------------------------------------------------------
// GETTERS & SETTERS	

	public Integer getCashTendered() {
		return cashTendered;
	}

	public void setCashTendered(Integer cashTendered) {
		this.cashTendered = cashTendered;
	}
}