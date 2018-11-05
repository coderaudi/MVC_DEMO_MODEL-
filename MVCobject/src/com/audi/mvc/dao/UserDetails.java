package com.audi.mvc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.audi.databases.DBCon;
import com.audi.mvc.dto.DataBean;

// jdbc implimentation to get the data from databases and upcasting to the User interface 
public class UserDetails implements User {

	public DataBean getDetails(int userid) {
		DataBean  dbean = new DataBean();
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		con = DBCon.mydb_con();
		try {
			stmt = con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			rset  = stmt.executeQuery("select * from users where userid = "+userid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			while (rset.next()) {
				dbean.setUserid(rset.getInt("userid"));
				dbean.setUsername(rset.getString("username"));
				dbean.setPassword(rset.getString("password"));
				dbean.setEmail(rset.getString("email"));
				dbean.setMobile(rset.getLong("mobile"));
				dbean.setAddress(rset.getString("address"));
				
				return dbean; 
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return null;
	}
}
