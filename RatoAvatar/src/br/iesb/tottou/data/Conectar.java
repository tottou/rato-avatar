package br.iesb.tottou.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {
	
	public Connection getConnection() {
		try {
		return DriverManager.getConnection("jdbc:mysql://localhost/teste","root","toor");
		} catch(SQLException e) {
		throw new RuntimeException(e);
		}

	}
}


