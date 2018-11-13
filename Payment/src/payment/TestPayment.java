package payment;
import java.util.ArrayList;

public class TestPayment {
	
	private ArrayList<Payment> operations;
	private Integer amountInBank = 2500;
	
//-------------------------------------------------------------------------------
// CONSTRUCTOR		

	public TestPayment() {
		this.operations = new ArrayList<Payment>();
	}
	
//-------------------------------------------------------------------------------
// METHODS		

	public boolean operationStatus(Payment payment) {
		if(payment instanceof Credit) {
			Credit credit = (Credit) payment;
			return credit.authorized();
		}
		
		if(payment instanceof Cheque){
			Cheque check = (Cheque) payment;
			return check.authorized(amountInBank);
		}
		
		if(payment instanceof Cash) {
			return true;
		}
		return false;
	}
	
	public void updateAmountInBank(Integer amount) {
		this.setAmountInBank(this.getAmountInBank() - amount);
	}
	
	public Integer change() {
		return this.getAmountInBank();
	}

//-------------------------------------------------------------------------------
// GETTERS & SETTERS
	
	public ArrayList<Payment> getOperations() {
		return operations;
	}

	public void setOperations(ArrayList<Payment> operations) {
		this.operations = operations;
	}

	public Integer getAmountInBank() {
		return amountInBank;
	}

	public void setAmountInBank(Integer amountInBank) {
		this.amountInBank = amountInBank;
	}	
	
}