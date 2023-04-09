package com.cg.util;

import java.sql.Connection;
import java.sql.SQLException;

public class Executor {

	public static void main(String[] args) throws SQLException {
		Connection connection = DButil.getconnection();
		if(connection != null) {
			System.out.println("Connection established successfully");
		}
		StatementInterfaceDemo.readAllEmployee();
	}

}
