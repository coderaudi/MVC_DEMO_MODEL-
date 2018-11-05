package com.audi.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon implements DBinfo {
	
	public static Connection mydb_con() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(DBURL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
