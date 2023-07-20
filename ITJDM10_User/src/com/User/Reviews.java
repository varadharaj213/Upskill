package com.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.MsgBean;
import com.Implementation.Implementation;
import com.Interfaces.Interface;

/**
 * Servlet implementation class Reviews
 */
@WebServlet("/Reviews")
public class Reviews extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reviews() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("uname");
		String review=request.getParameter("msg");
		
		MsgBean bean=new MsgBean();
		bean.setUname(name);
		bean.setMessage(review);
		Interface i=new Implementation();
       int result=i.review(bean);
		
		if(result==1)
		{
			response.sendRedirect("reviews.jsp");
		}else
		{
			response.sendRedirect("error.jsp");
		}
	}

}
