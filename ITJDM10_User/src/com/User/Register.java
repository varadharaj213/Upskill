package com.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.UserBean;
import com.Implementation.Implementation;
import com.Interfaces.Interface;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Register page");
		String name = request.getParameter("uname");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String mobile = request.getParameter("mobile");
		String mail = request.getParameter("mail");
		String address = request.getParameter("address");
		
		HttpSession session=request.getSession();
		session.setAttribute("mobile", mobile);

		UserBean ub = new UserBean();
		ub.setName(name);
		ub.setPassword(password);
		ub.setGender(gender);
		ub.setGender(gender);
		ub.setDob(dob);
		ub.setMail(mail);
		ub.setMobile(mobile);
		ub.setAddress(address);

		Interface i = new Implementation();
		int result = i.register(ub);

		if (result == 1) {
			response.sendRedirect("success.jsp");

		} else {
			response.sendRedirect("error.jsp");

		}

	}

}
