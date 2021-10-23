package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String jdbcUrl = "jdbc:sqlite:/C:\\Users\\Krathish sk\\Desktop\\DataBase\\Movies.db";
		Connection connection = DriverManager.getConnection(jdbcUrl);
		String sql = "SELECT * FROM Movies";
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery(sql);
		
		while(result.next())
		{
			String mname = result.getString("Movies");
			String aname = result.getString("Name of the Actor");
			String acname = result.getString("Name of the Actress");
			Integer year = result.getInt("Year");
			String dname = result.getString("Name of the Director");
			
			System.out.println(mname + " | "+ aname + " | " + acname + " | "+ year+ " | "+dname);	
			System.out.println();
		}
		}
		catch(SQLException e)
		{
			System.out.println("Eroor Connection to SQlite database");
			e.printStackTrace();
		}

	}

}
