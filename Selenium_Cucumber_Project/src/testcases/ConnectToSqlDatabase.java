package testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectToSqlDatabase {
	@Test
	public void retrieveDataFromSql() throws SQLException {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Enigma@089");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * From world.collegues;");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
