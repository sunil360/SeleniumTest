package com.databaseconnectivity;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DatabaseConnectivity {
	
	public static void main(String args[])
	{
		try
		{  
			
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","360logica");
			
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","360logica");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee;");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
		}
	    catch(Exception e)
		{
	    	 	
		}  
	
}
}


