package com.kn.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/university";
		String USER_NAME = "root";
		String PASSWORD = "ilai.papa1408";
		// String CREATE_STUDENT_QUERY = "CREATE TABLE STUDENT8 (ID INT, NAME
		// VARCHAR(20), MARKS INT);";
		// String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT8 VALUES(1,'RAM', 100);";
		// String UPDATE_STUDENT_QUERY = "UPDATE STUDENT8 SET NAME = 'SHRI RAM' WHERE
		// NAME = 'RAM';";
		String DELETE_STUDENT_QUERY = "DELETE FROM STUDENT8 WHERE ID = 1;";

		try {
			// 1. Load & Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// FQCN(Fully Qualified Class Name) - Canonical Name
			System.out.println("====>Driver Loaded and Registered Successfully!");

			// 2. Establish the connection with Database
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("====>Connection established successfully ===> " + con);

			// 3. Create Statement Object
			Statement stmt = con.createStatement();

			// 4. Send & Execute Query
			// stmt.execute(CREATE_STUDENT_QUERY);

			/*
			 * int rowsAffected = stmt.executeUpdate(INSERT_STUDENT_QUERY);
			 * System.out.println(rowsAffected + " rows affected.");
			 */

			/*
			 * int rowsAffected = stmt.executeUpdate(UPDATE_STUDENT_QUERY);
			 * System.out.println(rowsAffected + " rows affected.");
			 */

			int rowsAffected = stmt.executeUpdate(DELETE_STUDENT_QUERY);
			System.out.println(rowsAffected + " rows affected.");

			System.out.println("---->Student8 Table created successfully");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed to establish connection");
			e.printStackTrace();
		}


	}

}

