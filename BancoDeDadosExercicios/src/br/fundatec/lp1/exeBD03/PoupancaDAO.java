package br.fundatec.lp1.exeBD03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PoupancaDAO {

	private Connection con;

	public PoupancaDAO(Connection con) {
		super();
		this.con = con;
	}

	public void adiciona(ContaPoupanca poupanca) {
		String sql = "INSERT INTO contapoupanca " + "(nomedono, saldo, tipo)" + "VALUES (?,?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, poupanca.getNm_nomeDono());
			stmt.setInt(2, poupanca.getNr_saldo());
			stmt.setString(3, poupanca.getDs_tipo());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<ContaPoupanca> getLista() {
		List<ContaPoupanca> poupancas = new ArrayList<ContaPoupanca>();

		String sql = "SELECT * FROM contapoupanca";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ContaPoupanca poupanca = new ContaPoupanca();
				poupanca.setId(rs.getLong("id"));
				poupanca.setNm_nomeDono(rs.getString("nomedono"));
				poupanca.setNr_saldo(rs.getInt("saldo"));
				poupanca.setDs_tipo(rs.getString("tipo"));

				poupancas.add(poupanca);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return poupancas;

	}

	public void deletarConta() {
		String sql = "delete FROM contapoupanca";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deletarNumeroContaPoupanca(int id) {
		String sql = "delete from contapoupanca where id = ? ";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
