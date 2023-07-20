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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Login Page");
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		System.out.println("Login Page"+id+" "+password);
		
		HttpSession session=request.getSession();
		session.setAttribute("id", id);
		
		UserBean bean=new UserBean();
		bean.setId(id);
		bean.setPassword(password);
		
		Interface i=new Implementation();
		int result=i.login(bean);
		
		if(result==1)
		{
			response.sendRedirect("welcome.jsp");
		}else
		{
			response.sendRedirect("error.jsp");
		}
	}

}
