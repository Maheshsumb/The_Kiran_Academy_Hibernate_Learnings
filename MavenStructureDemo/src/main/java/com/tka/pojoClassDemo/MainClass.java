package com.tka.pojoClassDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		if(c!=null) System.out.println("Successfull......");
		else System.out.println("Failed.....");
	}

}
