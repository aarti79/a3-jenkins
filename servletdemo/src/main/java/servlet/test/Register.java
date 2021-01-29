package servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("Name");
		String username=request.getParameter("userName");   
		String email=request.getParameter("userEmail"); 
		String age = request.getParameter("userAge");
		String country=request.getParameter("userCountry");  
		String city = request.getParameter("userCity");
		String contact = request.getParameter("userContact");
				
				if(username.isEmpty() || email.isEmpty() || city.isEmpty() || 
						country.isEmpty() || contact.isEmpty() || age.isEmpty())
				{
					RequestDispatcher req = request.getRequestDispatcher("register_1.html");
					req.include(request, response);
				}
				else
				{
					out.println("<B>Welcome "+name+"<br>Your UserName is: "+username+"<br>Your email is: "+email+"<br> Your Age is: "+age+"<br>Your country is:"+country+"<br>Your city is: "+city+"<br>Your Contact No. is:"+contact);
				} 

	}
	

}
