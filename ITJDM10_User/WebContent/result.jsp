<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@ page import="java.util.List" %>
 <%@ page import="java.sql.*" %>
  <%@ page import="com.Connections.*" %>
 <%  PreparedStatement ps1 = null;
 	ResultSet resultSet1= null;
Statement st1=null;
String s=request.getParameter("val");  
	
%>
 
									<%
										String query = "select * from medicine where problem like '"+s+"%'";
										ps1 = Connections.con().prepareStatement(query);
										resultSet1 = ps1.executeQuery();
										out.println("<html><body><table style=width: 100% border=2 >");
										out.println("<tr bgcolor=yellow><td>Problem</td><td>Symptoms</td><td>Medicine</td><td>Dose</td><td>Morn</td><td>AftNoon</td>	<td>Eve</td></tr>");							
												
												
												
												
												
												
												
												
												
											
										while (resultSet1.next()) {
											
									out.println("<tr><td>"+resultSet1.getString(2)+"</td>");
									out.println("<td>"+resultSet1.getString(3)+"</td>");
									out.println("<td>"+resultSet1.getString(4)+"</td>");
									out.println("<td>"+resultSet1.getString(5)+"</td>");
									out.println("<td>"+resultSet1.getString(6)+"</td>");
									out.println("<td>"+resultSet1.getString(7)+"</td>");
									out.println("<td>"+resultSet1.getString(8)+"</td></tr>");
									
										}
										out.println("</table></body></html>");
									%>
