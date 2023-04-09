package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DButil {
	private static final String db_driverclass = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/jdbcdatabase";
	private static final String db_username = "root";
	private static final String db_password = "Yokesh2001$";
	private static Connection con;
	
	public static Connection getconnection() {
	
	//Load and register the driver
	try {
		Class.forName(db_driverclass);
		System.out.println("Driver loaded successfully");
		
		//Establish the connection
		con = DriverManager.getConnection(db_url, db_username, db_password);
		System.out.println("Connection established successfully");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return con;
	}
}
