package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.LoginValidator;

/**
 * Servlet implementation class ServApp5
 */
@WebServlet("/ServApp5")
public class ServApp5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String pswrd1 = request.getParameter("opswrd");
		String pswrd2 = request.getParameter("npswrd");
		String pswrd3 = request.getParameter("cpswrd");
		if(pswrd2.equals(pswrd3)) {
			LoginValidator validator = new LoginValidator();
			validator.updatePassword(pswrd1, pswrd2);
			printWriter.print("Password Updated");
		}
		else {
			printWriter.print("New Password and Confirm Password do not match");
		}
		
	}

}
