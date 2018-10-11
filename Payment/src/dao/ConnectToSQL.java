package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToSQL {
	
	public static final String URL = "jdbc:mysql://localhost:3306/payment?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String USER = "root";
	public static final String PASS = "";
	/**
	* Get a connection to database
	* @return Connection object
	 * @throws ClassNotFoundException 
	*/
	public static Connection getConnection() throws ClassNotFoundException {
	   try {
	       //DriverManager.registerDriver(new Driver());
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   System.out.println("Driver loaded!");
	       return DriverManager.getConnection(URL, USER, PASS);
	   } catch (SQLException ex) {
	       throw new RuntimeException("Error connecting to the database", ex);
	   }
	}
}