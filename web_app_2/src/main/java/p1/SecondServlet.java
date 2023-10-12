package p1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SecondServlet() {
        super();
   
    }
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// print null
		String name = (String)request.getAttribute("firstName");
		System.out.println(name);
		
		//This is print mike
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("sessionName"));
    }
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = (String)request.getAttribute("firstName");
		System.out.println(name);
		
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("sessionName"));
	}

}
