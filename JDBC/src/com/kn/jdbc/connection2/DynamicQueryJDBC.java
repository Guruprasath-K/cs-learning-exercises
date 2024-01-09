package com.kn.jdbc.connection2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicQueryJDBC {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";

	// private static final String CREATE_EMPLOYEE2_QUERY = "CREATE TABLE
	// EMPLOYEE2(ID INT, NAME VARCHAR(20), SALARY INT);";
	private static final String INSERT_EMPLOYEE2_QUERY = "INSERT INTO EMPLOYEE2 VALUES(?,?,?);";
	private static final String SELECT_ALL_EMPLOYEE2_QUERY = "SELECT * FROM EMPLOYEE2;";
	private static final String UPDATE_EMPLOYEE2_QUERY = "UPDATE EMPLOYEE2 SET SALARY = (SALARY+1000) WHERE ID = ?;";
	private static final String DELETE_EMPLOYEE2_QUERY = "DELETE FROM EMPLOYEE2 WHERE ID = ?;";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection con = null;

		// 1. Load and Register Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Establish the connection with Database
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			// 4. Send and execute query

			// Insert Data
			while (true) {
				System.out.println("Choose the appropriate option: ");
				System.out.println("1 ==> To Insert Data");
				System.out.println("2 ==> To Read Data");
				System.out.println("3 ==> To Update Data");
				System.out.println("4 ==> To Delete Data");
				System.out.println("5 ==> Quit");
				int option = scan.nextInt();

				switch (option) {
				case 1: {
					selectQuery(con);
					insertData(con, scan);
					selectQuery(con);
					break;
				}
				case 2: {
					selectQuery(con);
					break;
				}
				case 3: {
					selectQuery(con);
					updateQuery(con, scan);
					selectQuery(con);
					break;
				}
				case 4: {
					selectQuery(con);
					deleteQuery(con, scan);
					selectQuery(con);
					break;
				}
				case 5: {
					if (con != null) {
						con.close();
					}
					System.out.println("Connection closed...!");
					System.exit(0);
				}
				default: {
					System.out.println("Invalid Input");
				}
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed to establish connection");
			e.printStackTrace();
		} finally {
			if (scan != null) {
				scan.close();
			}
		}
	}

	private static void insertData(Connection con, Scanner scan) {
		try {
			System.out.println("Enter value for ID = ");
			int id = scan.nextInt();
			System.out.println("Enter value for Name = ");
			String name = scan.next();
			System.out.println("Enter value for Salary = ");
			Double salary = scan.nextDouble();

			PreparedStatement pstmt1 = con.prepareStatement(INSERT_EMPLOYEE2_QUERY);
			pstmt1.setInt(1, id);
			pstmt1.setString(2, name);
			pstmt1.setDouble(3, salary);
			pstmt1.execute();

			System.out.println("====>Data added successfully<====");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void selectQuery(Connection con) {
		System.out.println("<==============================>");
		try {
			PreparedStatement pstmt2 = con.prepareStatement(SELECT_ALL_EMPLOYEE2_QUERY);

			ResultSet rs = pstmt2.executeQuery();
			while (rs.next()) {
				System.out.println(
						"ID = " + rs.getInt(1) + ", Name = " + rs.getString(2) + ", Salary = " + rs.getDouble(3));
			}
			System.out.println("=========>Data Retrieved<=========");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateQuery(Connection con, Scanner scan) {
		System.out.println("Enter the ID value where the update needs to done: ");
		int id = scan.nextInt();

		try {
			PreparedStatement pstmt3 = con.prepareStatement(UPDATE_EMPLOYEE2_QUERY);
			pstmt3.setInt(1, id);
			int rowsAffected = pstmt3.executeUpdate();
			System.out.println(rowsAffected + " rows affected.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void deleteQuery(Connection con, Scanner scan) {
		System.out.println("Enter the ID value where the deletion needs to done: ");
		int id = scan.nextInt();

		try {
			PreparedStatement pstmt4 = con.prepareStatement(DELETE_EMPLOYEE2_QUERY);
			pstmt4.setInt(1, id);
			int rowsAffected = pstmt4.executeUpdate();
			System.out.println(rowsAffected + " rows affected.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
