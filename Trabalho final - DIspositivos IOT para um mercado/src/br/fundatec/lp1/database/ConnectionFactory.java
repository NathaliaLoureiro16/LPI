package br.fundatec.lp1.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Classe que faz a conexão com o banco de dados
 * @author Nathalia
 *
 */
public class ConnectionFactory {
	public Connection fabricate() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Iot", "postgres", "postgres");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
