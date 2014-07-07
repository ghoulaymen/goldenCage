package tn.edu.esprit.cinfo2.zanga.goldenCage.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	private static Connection myConnetion;
	private static String db_name = "goldenCage";
	private static String host = "jdbc:mysql://localhost:3306/";

	private static String url=host+db_name+"?allowMultiQueries=true";
	private static String user = "root";
	private static String password = "";
	

public static Connection giveMyconnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver chargé");
			
			myConnetion = DriverManager.getConnection(url, user, password);
						
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return myConnetion;
	}
}
