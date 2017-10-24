package br.fundatec.lp1.exeBD03;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp1.exeBD01.ConnectionFactory;
import br.fundatec.lp1.exeBD03.ContaCorrente;

public class AppTest {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().fabricante();
		System.out.println("CONECTADO!!");
		CorrenteDAO cDao = new CorrenteDAO(con);
		PoupancaDAO pDao = new PoupancaDAO(con);

		// inicio
		ContaCorrente corrente = new ContaCorrente();
		corrente.setNm_nomeDono("Tyrion");
		corrente.setNr_saldo(5000);
		corrente.setNr_limite(1000);
		corrente.setNr_investimento(true);
		cDao.adiciona(corrente);

		// fim

		// inicio
		List<ContaCorrente> correntes = new ArrayList<ContaCorrente>();
		correntes = cDao.getLista();
		for (ContaCorrente cont : correntes) {
			System.out.println("ID: " + cont.getId());
			System.out.println("NomeDono: " + cont.getNm_nomeDono());
			System.out.println("Saldo: " + cont.getNr_saldo());
			System.out.println("Limite: " + cont.getNr_limite());
			System.out.println("Investimento: " + cont.isNr_investimento() + "\n");
		}
		// fim
		
		//cDao.deletarConta();
		//pDao.deletarConta();
		//cDao.deletarNumeroConta(9);
		//pDao.deletarNumeroContaPoupanca(3);
		

		// inicio
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setNm_nomeDono("Tyrion");
		poupanca.setNr_saldo(5000);
		poupanca.setDs_tipo("Pessoa fisica");
		pDao.adiciona(poupanca);

		// fim
		
		
		
		// inicio
		List<ContaPoupanca> poupancas = new ArrayList<ContaPoupanca>();
		poupancas = pDao.getLista();
		for (ContaPoupanca cont : poupancas) {
			System.out.println("ID: " + cont.getId());
			System.out.println("NomeDono: " + cont.getNm_nomeDono());
			System.out.println("Saldo: " + cont.getNr_saldo());
			System.out.println("Tipo: " + cont.getDs_tipo() + "\n");
		}
		// fim

		con.close();
	}
}
