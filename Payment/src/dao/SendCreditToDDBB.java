package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SendCreditToDDBB {
	
	String id;
	Integer amount;
	String number;
	String name;
	String expDate;
	
	public SendCreditToDDBB(String id, Integer amount, String number, String name, String expDate) {
		this.id = id;
		this.amount = amount;
		this.number = number;
		this.name = name;
		this.expDate = expDate;
	}
	
	public void send() throws ClassNotFoundException {
		try {
			Connection connection = ConnectToSQL.getConnection();
			//PreparedStatement ps = connection.prepareStatement("INSERT INTO Check VALUES (ID, Amount, Name, BankID)");
			PreparedStatement ps = connection.prepareStatement("INSERT INTO Credit VALUES (?, ?, ?, ?, ?)");
			ps.setString(1, id);
			ps.setInt(2, amount);
			ps.setString(3, number);
			ps.setString(4, name);
			ps.setString(5, expDate);
			int i = ps.executeUpdate();
			if(i == 1) {
				System.out.println("Done!");
			} 
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	

}
