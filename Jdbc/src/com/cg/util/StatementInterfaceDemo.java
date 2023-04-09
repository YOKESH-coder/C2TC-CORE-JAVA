package com.cg.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInterfaceDemo {
	
	//create
	public static void createEmployee() throws SQLException {  
		Connection connection = DButil.getconnection();
		Statement st = connection.createStatement();
		String sqlinsert = "INSERT INTO employee(name, salary, bonus)" + "values('Yokesh', 5000.00, 500.00)";
		int execute = st.executeUpdate(sqlinsert);
		if(execute == 1) {
			System.out.println("Data added successfully");
		}
	}
	
	//Update
	public static void updateEmployee() throws SQLException {
		Connection connection = DButil.getconnection();
		Statement st = connection.createStatement();
		String sqlupdate = "UPDATE employee SET bonus = 100.00 where id = 1";
		int execute = st.executeUpdate(sqlupdate);
		if(execute == 1) {
			System.out.println("Data updated successfully");
		}
	}
	
	//Delete
	public static void deleteEmployee() throws SQLException {
		Connection connection = DButil.getconnection();
		Statement st = connection.createStatement();
		String sqlupdate = "DELETE FROM employee WHERE id = 1";
		int execute = st.executeUpdate(sqlupdate);
		if(execute == 1) {
			System.out.println("Data deleted successfully");
		}
	}
	
	//Read
	public static void readByIdEmployee() throws SQLException {
		Connection connection = DButil.getconnection();
		Statement st = connection.createStatement();
		String sqlread = "SELECT * FROM employee WHERE id = 1";
		
		ResultSet rs = st.executeQuery(sqlread);
		if(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			Double salary = rs.getDouble(3);
			Double bonus = rs.getDouble(4);
			System.out.println(id + " "+ name +" "+ salary +" "+ bonus);
		}
		else {
			System.out.println("No data found");
		}
	}
	
	public static void readAllEmployee() throws SQLException {
		Connection connection = DButil.getconnection();
		Statement st = connection.createStatement();
		String sqlreadall = "SELECT * FROM employee";
		
		ResultSet rs = st.executeQuery(sqlreadall);
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			Double salary = rs.getDouble(3);
			Double bonus = rs.getDouble(4);
			System.out.println(id + " "+ name +" "+ salary +" "+ bonus);
		}
}
}
