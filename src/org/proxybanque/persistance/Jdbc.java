package org.proxybanque.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Jdbc {

	// paramètres pour acceder à bddozlemetienneproxibanquemysql.sql

	public static final String driver = "com.mysql.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/bddozlemetienneproxibanquemysql";
	public static final String login = "root";
	public static final String password = "";

	public static final Connection openConnection() throws ClassNotFoundException, SQLException {

		Connection connection = null;

		// Chargement du driver

		Class.forName(driver);

		// Création de la connexion

		connection = DriverManager.getConnection(url, login, password);

		System.out.println("--> Connection... <--");

		return connection;
	}

	public void closeConnection(Connection connection, PreparedStatement pstmt, ResultSet rs) {

		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
