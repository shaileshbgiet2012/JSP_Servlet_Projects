package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String email = request.getParameter("email");
	   String password= request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db","root","12345@#.sK");
			Statement stmnt = con.createStatement();
			
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password ='"+password+"'");
			
			PrintWriter out = response.getWriter();
			if(result.next()){
				out.print("Welcome");
			}else {
				out.print("Invalid username/password");
			}
				
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
