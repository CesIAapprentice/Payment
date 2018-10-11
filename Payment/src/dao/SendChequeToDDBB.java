package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SendChequeToDDBB {
	
	String id;
	Integer amount;
	String name;
	String bankID;
	
	public SendChequeToDDBB(String id, Integer amount, String name, String bankID) {
		this.id = id;
		this.amount = amount;
		this.name = name;
		this.bankID = bankID;
	}

	public void send() throws ClassNotFoundException {
		try {
			Connection connection = ConnectToSQL.getConnection();
			//PreparedStatement ps = connection.prepareStatement("INSERT INTO Check VALUES (ID, Amount, Name, BankID)");
			PreparedStatement ps = connection.prepareStatement("INSERT INTO Cheque VALUES (?, ?, ?, ?)");
			ps.setString(1, id);
			ps.setInt(2, amount);
			ps.setString(3, name);
			ps.setString(4, bankID);
			int i = ps.executeUpdate();
			if(i == 1) {
				System.out.println("Done!");
			} 
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}