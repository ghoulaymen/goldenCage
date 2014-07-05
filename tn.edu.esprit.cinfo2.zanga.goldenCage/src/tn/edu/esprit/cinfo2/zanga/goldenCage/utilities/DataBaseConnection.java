package tn.edu.esprit.cinfo2.zanga.goldenCage.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	private static Connection myConnetion;
	private static String db_name = "downexclgolden";
	private static String host = "jdbc:mysql://downexclgolden.mysql.db:3306/";

	private static String url=host+db_name+"?allowMultiQueries=true";
	private static String user = "downexclgolden";
	private static String password = "UE8tE6c2E5b8";
	

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
