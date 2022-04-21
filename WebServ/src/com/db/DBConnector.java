package com.db;

import java.sql.DriverManager;

public class DBConnector {
	private static DBConnector connector = new DBConnector();

	private DBConnector() {
	}

	public static DBConnector getDBResource() {
		return connector;
	}

	public java.sql.Connection getConnected() throws Exception {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");

	}
}