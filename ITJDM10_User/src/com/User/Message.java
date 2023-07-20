package com.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.MsgBean;
import com.Implementation.Implementation;
import com.Interfaces.Interface;

/**
 * Servlet implementation class Message
 */
@WebServlet("/Message")
public class Message extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Message() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid=request.getParameter("uid");
		String uname=request.getParameter("uname");
		String drid=request.getParameter("drid");
		String drname=request.getParameter("drname");
		String message=request.getParameter("msg");
		
		HttpSession session=request.getSession(false);  
	    session.setAttribute("msg", message);
	    
		MsgBean bean=new MsgBean();
		bean.setUid(uid);
		bean.setUname(uname);
		bean.setDrid(drid);
		bean.setDrname(drname);
		bean.setMessage(message);
		
		Interface i=new Implementation();
		int result=i.msg(bean);
		
		if(result==1)
		{
			response.sendRedirect("messages.jsp?drid="+drid+"&drname="+drname);
		}else
		{
			response.sendRedirect("failed.jsp");
		}
	}

}
