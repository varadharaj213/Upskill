<%@ page import="java.sql.*"%>  
  
<%  
String s=request.getParameter("val"); 
String s1=request.getParameter("val1"); 
String s2=request.getParameter("val2"); 
System.out.println("value3="+s2);
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itjdm10","root","root");  
PreparedStatement ps=con.prepareStatement("select dr_msg,dr_time from messages where user_id=? and dr_id=? and user_msg=?");  
ps.setString(1,s);  
ps.setString(2,s1);  
ps.setString(3,s2);
ResultSet rs=ps.executeQuery();  
while(rs.next())
{  
out.print(rs.getString(1)+"<br>");  
System.out.println("Ajax"+rs.getString(1));
}  
con.close();  
}
catch(Exception e)
{
	e.printStackTrace();
}  

%>  