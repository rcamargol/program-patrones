package co.edu.unbosque.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConexinDerby {

	public static void main(String[] args) throws SQLException {
		Connection connection = conectar("app", "app", "jdbcDemoDB");
		
		String query = "select * from WISH_LIST";
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		while (rs.next()) {
	        String item = rs.getString("WISH_ITEM");
	        System.out.println("ITEM := " + item);
	      }
		
		rs.close();
		statement.close();
		connection.close();
	}

	private static Connection conectar(String userName, String password, String dbName)
			throws SQLException {
		Connection conn = null;
		Properties connectionProps = new Properties();
		connectionProps.put("user", userName);
		connectionProps.put("password", password);

		// jdbc:derby://localhost:1527/jdbcDemoDB;create=true
		String URL = "jdbc:derby://localhost:1527/" + dbName + ";create=true";
		System.out.println(URL);
		conn = DriverManager.getConnection(URL, connectionProps);
		System.out.println("Connected to database");
		return conn;
	}
}