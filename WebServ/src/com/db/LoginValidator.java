package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginValidator {
	private Connection connection = null;
	private PreparedStatement pstmt = null;
	public LoginValidator() {
		try {
			connection = DBConnector.getDBResource().getConnected();
			System.out.println("Connection ready");
		} catch (Exception e) {
			System.out.println(e);
			try {
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public boolean validate(Login login) {
		boolean flag=false;
		try {
			pstmt=connection.prepareStatement("select count(*) from userAccount where username=? and password=?");
			pstmt.setString(1, login.getUsername());
			pstmt.setString(2, login.getPassword());
			ResultSet resultSet =  pstmt.executeQuery();
			resultSet.next();
			
			if (resultSet.getInt(1)>=1) {
				flag=true;
			}
		} catch (Exception e) {
			flag=false;
		}
		return flag;
	}
	public boolean validatePhone(String phone) {
		boolean flag=false;
		String valString="";
		try {
			pstmt=connection.prepareStatement("select * from userAccount");
			ResultSet resultSet =  pstmt.executeQuery();
			while(resultSet.next()) {
				String phoneNumber = resultSet.getString("phone");
				if (phoneNumber.equals(phone)) {
					flag=true;
				}
			}
		} catch (Exception e) {
			flag=false;
			System.out.println(valString);
		}
		return flag;
	}
	public void updatePassword(String pswrd1,String pswrd2) {
		try {
			pstmt=connection.prepareStatement("update userAccount set password=? where password=?");
			pstmt.setString(1, pswrd2);
			pstmt.setString(2, pswrd1);
			ResultSet resultSet =  pstmt.executeQuery();	
			connection.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
