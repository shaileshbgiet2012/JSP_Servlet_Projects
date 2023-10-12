package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class D {
	public static void main(String[] args) {
		
		//1.Connect to database
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/simpledb","root","12345@#.sK");
			System.out.println(con);
		
		//2.Write / embed sql query in java code
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from registration");
			
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
			}
		
		//3. Close database Connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
