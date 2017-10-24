package br.fundatec.lp1.exeBD01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection fabricante() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/BDTeste","postgres","fundatec");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
