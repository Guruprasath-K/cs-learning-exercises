package com.kn.jdbc.connection4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentJDBCDemo {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";


	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			Statement stmt = con.createStatement();

			Student s1 = new Student(2, "Amit", 25);
			Student s2 = new Student(3, "Ankit", 55);
			DBHandler.insertData(con, s1);
			DBHandler.insertData(con, s2);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
