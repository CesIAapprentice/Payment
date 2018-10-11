import dao.SendCreditToDDBB;
import payment.Credit;

public class Main {
		
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Cheque test = new Cheque("2", 200, "test", "5");
		//SendChequeToDDBB sendTest = new SendChequeToDDBB(test.getId(), test.getAmount(), test.getName(), test.getBankID());
		//sendTest.send();
		/*Cash cashtest = new Cash("1", 50, 50);
		SendCashToDDBB sendCashTest = new SendCashToDDBB(cashtest.getId(), cashtest.getAmount(), cashtest.getCashTendered());
		sendCashTest.send();*/
		Credit testCredit = new Credit("1", 700, "0214876423985690", "César", "022020");
		SendCreditToDDBB SendCreditTest = new SendCreditToDDBB(testCredit.getId(), testCredit.getAmount(), testCredit.getNumber(),
																testCredit.getName(), testCredit.getExpDate());
		SendCreditTest.send();
	}
}