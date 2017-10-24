package br.fundatec.lp1.app;

import java.sql.SQLException;

import br.fundatec.lp1.midd.Middleware;

public class AppTest {
	/**
	 * Classe que executa o Middleware.
	 * @author Nathalia
	 *
	 */
	public static void main(String[] args) throws SQLException {
		Middleware midd = new Middleware();
		System.out.println(midd.turnSecuritySystemOff());
		System.out.println(midd.turnSecuritySystemOn());
		System.out.println(midd.callingPolice());
		midd.databaseRecords();
	}

}
