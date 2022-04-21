package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.Login;
import com.db.LoginValidator;

/**
 * Servlet implementation class ServApp3
 */
@WebServlet("/ServApp3")
public class ServApp3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String name = request.getParameter("uname");
		String pswrd = request.getParameter("pword");
		LoginValidator validator = new LoginValidator();
		if(validator.validate(new Login(name,pswrd))) {
//			printWriter.print("Valid User Account");
			response.sendRedirect("UserInputs.html");
		}
		else {
			response.sendRedirect("Page1.html");
		}
	}

}
