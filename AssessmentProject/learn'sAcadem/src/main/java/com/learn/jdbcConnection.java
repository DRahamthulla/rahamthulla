package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcConnection {

static Connection con =null;
	
	public static void main(String[] args) throws Exception {
		jdbcConnection connection=new jdbcConnection();
		 connection.getConnection();
	}
		

	public  Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		String userName="scott";
		String password="raham";
		 con =DriverManager.getConnection(url,userName,password);
		System.out.println("SUCESS");
		return con;

	}
}

