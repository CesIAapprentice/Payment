package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SendCashToDDBB {
	
	String id;
	Integer amount;
	Integer cashTendered;
	
	public SendCashToDDBB(String id, Integer amount, Integer cashTendered) {
		this.id = id;
		this.amount = amount;
		this.cashTendered = cashTendered;
	}

	public void send() throws ClassNotFoundException {
		try {
			Connection connection = ConnectToSQL.getConnection();
			//PreparedStatement ps = connection.prepareStatement("INSERT INTO Check VALUES (ID, Amount, Name, BankID)");
			PreparedStatement ps = connection.prepareStatement("INSERT INTO Cash VALUES (?, ?, ?)");
			ps.setString(1, id);
			ps.setInt(2, amount);
			ps.setInt(3, cashTendered);
			int i = ps.executeUpdate();
			if(i == 1) {
				System.out.println("Done!");
			} 
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}