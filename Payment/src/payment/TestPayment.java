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

	public boolean operationStatus(Payment payment) {
		if(payment instanceof Credit) {
			Credit credit = (Credit) payment;
			return credit.authorized();
		}
		
		if(payment instanceof Cheque){
			Cheque check = (Cheque) payment;
			return check.authorized();
		}
		
		if(payment instanceof Cash) {
			return true;
		}
		
		return false;
	}
}