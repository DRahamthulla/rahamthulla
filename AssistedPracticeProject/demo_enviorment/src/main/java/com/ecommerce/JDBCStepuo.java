package com.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCStepuo {
    
	private Connection connection;
	
	public void DBConnection(String dbURL,String user,String pwd)throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		this.connection=DriverManager.getConnection(dbURL,user,pwd);
	}
	 public Connection getConnection() {
		 return this.connection;
	 }
	  
	 public void closeConnection()throws SQLException{
		 if(this.connection!=null)
			 this.connection.close();
	 }
		

	 public static void main(String[] args) {
	}

}
