package com.registrationapp1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
   private Connection con;
   private Statement stmnt;
	@Override
	public void connectDB() {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationapp1", "root", "12345@#.sK");
	        stmnt=con.createStatement();
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }
    @Override
	public boolean verifyLogin(String Email, String Password) {
    	try {
			ResultSet result = stmnt.executeQuery("select * from login where Email='"+Email+"' and Password='"+Password+"'");
		    return result.next();
    	} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	@Override
	public void SaveRegistration(String Name, String City, String Email, String Mobile) {
		try {
			stmnt.executeUpdate("insert into registration values('"+Name+"', '"+City+"', '"+Email+"','"+Mobile+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public ResultSet getAllReg() {
		try {
			ResultSet result = stmnt.executeQuery("select * from registration");
		    return result;
    	} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void deleteRegistration(String email) {
		try {
			stmnt.executeUpdate("delete from registration where email='"+email+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void updateReg(String Email, String Mobile) {
		try {
			stmnt.executeUpdate("UPDATE registration SET Mobile='"+Mobile+"' WHERE Email='"+Email+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
