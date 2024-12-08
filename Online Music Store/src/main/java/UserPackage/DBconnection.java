package UserPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	private static String url = "jdbc:mysql://localhost:3306/musicstore";
	private static String user = "root";
	private static String pass = "1234";
	
	private static Connection conn;

	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("DBConnection Esatblished Sucessfully");
		} catch (Exception e) {
			System.out.println("DBConnection Esatblished Unscuessfully");
		}
		return conn;
	}
	
	
	
	
	
	
	
	
	
}
