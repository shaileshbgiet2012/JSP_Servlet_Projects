package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteRegistration() {
        super();
        
    }

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	System.out.println("Get");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
	    String email = request.getParameter("email");
	    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpledb","root","12345@#.sK");
			Statement stmnt = con.createStatement();
			
			stmnt.executeUpdate("Delete from registration where email='"+email+"'");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
