package com.kn.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";

	private static final String UPDATE_QUERY = "UPDATE EMPLOYEE2 SET SALARY = (SALARY + 1000) WHERE NAME = ?;";
	private static final String SELECT_QUERY = "SELECT * FROM EMPLOYEE2;";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection con = null;

		// 1. Load and Register Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Establish connection with the Database
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			updateQuery(con, scan);
			selectQuery(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		scan.close();
	}


	private static void updateQuery(Connection con, Scanner scan) {
		System.out.println("Enter the Employee name to increment the salary: ");
		String name = scan.next();

		try {
			PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY);
			pstmt.setString(1, name);
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " rows affected.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void selectQuery(Connection con) {
		try {
			PreparedStatement pstmt1 = con.prepareStatement(SELECT_QUERY);

			ResultSet rs = pstmt1.executeQuery();
			while (rs.next()) {
				System.out.println(
						"ID = " + rs.getInt(1) + ", Name  = " + rs.getString(2) + ", Salary = " + rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
