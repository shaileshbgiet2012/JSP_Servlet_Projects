package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your name:");
			String name= scan.next();
			
			System.out.println("Enter your city:");
			String city= scan.next();
			
			System.out.println("Enter your email:");
			String email= scan.next();
			
			System.out.println("Enter your mobile:");
			String mobile= scan.next();
			//1.Connect to database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/simpledb","root","12345@#.sK");
			System.out.println(con);
		
		//2.Write / embed sql query in java code
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values('"+name+"', '"+city+"','"+email+"', '"+mobile+"')");
		
		//3. Close database Connection
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
