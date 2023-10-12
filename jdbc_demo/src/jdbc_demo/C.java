package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		
		//1.Connect to database
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/simpledb","root","12345@#.sK");
			System.out.println(con);
		
		//2.Write / embed sql query in java code
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("UPDATE registration SET Mobile= '1122334455'WHERE email='stallin@gmail.com'");
		
		//3. Close database Connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
