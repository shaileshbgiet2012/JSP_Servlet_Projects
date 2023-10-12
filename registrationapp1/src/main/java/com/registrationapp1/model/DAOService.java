package com.registrationapp1.model;

import java.sql.ResultSet;

//Abstraction
public interface DAOService {
	public void connectDB();
	public boolean verifyLogin(String Email, String Password );
	public void SaveRegistration(String Name, String City, String Email, String Mobile);
	public ResultSet getAllReg();
	public void deleteRegistration(String email);
	public void updateReg(String email, String mobile);

}
