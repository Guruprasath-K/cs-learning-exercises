package com.kn.jdbc.connection4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHandler {

	private static final String QUERY = "INSERT INTO STUDENTS (NAME, MARKS) VALUES(?,?);";

	public static void insertData(Connection con, Student s) {
		String name = s.getName();
		int marks = s.getMarks();

		try {
			PreparedStatement pstmt = con.prepareStatement(QUERY);
			pstmt.setString(1, name);
			pstmt.setInt(2, marks);
			int count = pstmt.executeUpdate();
			System.out.println(count + " rows affected.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
