<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
<meta charset="UTF-8">
<title>Medical Hospital Website Template</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<%@ page import="java.util.List" %>
 <%@ page import="java.sql.*" %>
  <%@ page import="com.Connections.*" %>
 <%  PreparedStatement ps = null;
 	ResultSet resultSet= null;
Statement st=null;
PreparedStatement ps1 = null;
	ResultSet resultSet1= null;
	PreparedStatement ps2 = null;
	ResultSet resultSet2= null;
Statement st1=null;
String query=null;
%>
<% HttpSession session1=request.getSession(false);  
String id=(String)session.getAttribute("id");  
HttpSession session2=request.getSession();
session.setAttribute("id", id);
%>
<body>
	<div class="background">
		<div class="page">
			<a href="index.html" id="logo">Apollo Hospital</a>
			<div class="sidebar">
				<ul>
					<li class="selected"><a href="index.html">Home</a></li>
					<li><a href="programs.html">Programs</a></li>
					<li><a href="about.html">About</a></li>
					<li><a href="services.html">Services</a></li>
					<li><a href="contact.html">Contact</a></li>
					<li><a href="index.html">LOGOUT</a></li>
					
				</ul>
				<div class="first">
					<div>
						<h3>This is just a place holder</h3>
						<img src="images/man.jpg" alt="">
						<p>This is just a place holder, so you can see what the site
							would look like.</p>
					</div>
				</div>
				<div>
					<div>
						<h3>This is just a place holder</h3>
						<p>You can replace all this text with your own text.</p>
						<img src="images/doctors-and-nurse.jpg" alt="">
						<p>You can remove any link to our website from this website
							template, you&#39;re free to use this website template without
							linking back to us. You can remove any link to our website from
							this website template, you&#39;re free to use this website
							template without linking back to us. This is a place holder, so
							you can see what the site would look like.</p>
					</div>
				</div>
			</div>
			<div class="body">
				<div class="home">
					
						<img src="images/doctors.jpg" alt="">
						<div>
							
						</div>
					</div>
					
						<div>
							<div>
							<h3>Medicine search Engine</h3><br>
							<script type="text/javascript" src="validations/search.js"></script>
							<form name="search" action="">
							<table align="center">
							<tr><td>Problem</td><td>:</td><td><input type="text" name="problem" size="30" onkeyup="sendInfo()"></td></tr>
							
							</table>
							</form><br><br><br>
         	<span id="result"></span>
         	<br>
								<br>
								
						</div>
						
					</div>
				</div>
			</div>
			<div class="footer">
				<div>
					<div>
						<h4>Blog</h4>
						<p>This website template has been designed by Free Website
							Templates for you, for free. You can replace all this text with
							your own text.</p>
						<a href="blog.html">Go To Blog</a>
					</div>
					<div>
						<h4>Links</h4>
						<ul>
							<li><a href="index.html">Home</a></li>
							<li><a href="programs.html">Programs</a></li>
							<li><a href="about.html">About</a></li>
							<li><a href="services.html">Services</a></li>
							<li><a href="blog.html">Blog</a></li>
							<li><a href="contact.html">Contact</a></li>
						</ul>
					</div>
					<div class="connect">
						<h4>Keep In Touch</h4>
						<a href="http://freewebsitetemplates.com/go/twitter/" id="twitter">twitter</a>
						<a href="http://freewebsitetemplates.com/go/facebook/"
							id="facebook">facebook</a> <a
							href="http://freewebsitetemplates.com/go/googleplus/"
							id="googleplus">google+</a>
					</div>
				</div>
				<p>&#169; Copyright 2012. All rights reserved</p>
			</div>
		</div>
	</div>
</body>
</html>