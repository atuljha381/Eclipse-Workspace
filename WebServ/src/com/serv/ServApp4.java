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
 * Servlet implementation class ServApp4
 */
@WebServlet("/ServApp4")
public class ServApp4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String phnum = request.getParameter("phnum");
		LoginValidator validator = new LoginValidator();
		if(validator.validatePhone(phnum)) {
//			printWriter.print("Valid User Account");
			response.sendRedirect("pswrd.html");
		}
		else {
			printWriter.print("Some error occured");
		}
	}

}
