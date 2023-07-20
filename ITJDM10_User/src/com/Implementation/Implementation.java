package com.Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import com.Bean.DeleteBean;
import com.Bean.MsgBean;
import com.Bean.UserBean;
import com.Connections.Connections;
import com.Interfaces.Interface;

public class Implementation implements Interface{
	PreparedStatement ps=null;
	PreparedStatement ps1=null;
	ResultSet rs=null;
	Connection con=null;
	@Override
	public int register(UserBean bean) {
		int i=0;
		try {
			con=Connections.con();
			String query="insert into user values(id,?,?,?,?,?,?,?)";
			
			ps=con.prepareStatement(query);
			
			
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getPassword());
			ps.setString(3, bean.getGender());
			ps.setString(4, bean.getDob());
			ps.setString(5, bean.getMobile());
			ps.setString(6, bean.getMail());
			ps.setString(7, bean.getAddress());
			
			i=ps.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return i;
	}
	@Override
	public int login(UserBean bean) {
		
		int result=0;
		try {
			System.out.println("Impl");
			
				con=Connections.con();
			
			String query1="select * from user where id='"+bean.getId()+"' and password='"+bean.getPassword()+"'";
			System.out.println(query1);
			Statement st1=con.createStatement();
			ResultSet rs1=st1.executeQuery(query1);
	      
			if(rs1.next())
			{
				result=1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	@Override
	public int msg(MsgBean bean) {
		int i=0;
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			String date=dateFormat.format(cal.getTime()).toString();
			con=Connections.con();
			String query="insert into messages values(?,?,?,?,?,'---',?,'---')";
			
			ps=con.prepareStatement(query);
			
			
			ps.setString(1, bean.getDrid());
			ps.setString(2, bean.getDrname());
			ps.setString(3, bean.getUid());
			ps.setString(4, bean.getUname());
			ps.setString(5, bean.getMessage());
			ps.setString(6, date);
			
			i=ps.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return i;
	}
	@Override
	public int delete(DeleteBean bean) {
		int i=1;
		try {
			con=Connections.con();
			Iterator itr=bean.getList().iterator();
			while(itr.hasNext())
			{
				String msg=(String) itr.next();
			String query="delete from messages where user_id='"+bean.getId()+"' and user_msg like '"+msg+"%'";
			
			ps=con.prepareStatement(query);
			i=ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return i;
	}
	@Override
	public int review(MsgBean bean) {
		int i=0;
		try {
			con=Connections.con();
			String query="insert into reviews values(?,?)";
			
			ps=con.prepareStatement(query);
			ps.setString(1, bean.getUname());
			ps.setString(2, bean.getMessage());
			i=ps.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return i;
	}
}