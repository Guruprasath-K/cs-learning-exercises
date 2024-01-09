package com.kn.jdbc.connection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo1 {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";

	// private static final String CREATE_TRAINER_QUERY = "CREATE TABLE TRAINER(ID
	// INT, NAME VARCHAR(20))";
	// private static final String INSERT_TRAINER_QUERY = "INSERT INTO TRAINER
	// VALUES(1, 'Arun'), (2,'Punith');";
	// private static final String UPDATE_TRAINER_QUERY = "UPDATE TRAINER SET NAME =
	// 'Ayush' WHERE NAME = 'Punith';";
	// private static final String UPDATE_TRAINER_QUERY = "DELETE FROM TRAINER WHERE
	// ID = 03;";
	private static final String SELECT_ALL_TRAINER_QUERY = "SELECT * FROM TRAINER;";

	public static void main(String[] args) {

		Connection con = null;

		// 1. Load and Register Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Establish the connection with Database
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			// 3. Create a statement object
			Statement stmt = con.createStatement();

			// 4. Send and execute the query

			// stmt.execute(CREATE_TRAINER_QUERY)
			// System.out.println("Table created successfully");

			// int rowsAffected = stmt.executeUpdate(INSERT_TRAINER_QUERY);
			// System.out.println(rowsAffected + " rows affected");

			// int rowsAffected = stmt.executeUpdate(UPDATE_TRAINER_QUERY);
			// System.out.println(rowsAffected + " rows affected");

			// int rowsAffected = stmt.executeUpdate(DELETE_TRAINER_QUERY);
			// System.out.println(rowsAffected + " rows affected");

			ResultSet rs = stmt.executeQuery(SELECT_ALL_TRAINER_QUERY);

			while (rs.next()) {
				System.out.println("ID = " + rs.getInt(1) + ", NAME = " + rs.getString(2));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. Close the connection
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
