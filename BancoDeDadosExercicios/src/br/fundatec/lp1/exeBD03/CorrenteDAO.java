package br.fundatec.lp1.exeBD03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CorrenteDAO {

	private Connection con;

	public CorrenteDAO(Connection con) {
		super();
		this.con = con;
	}

	public void adiciona(ContaCorrente corrente) {
		String sql = "INSERT INTO contacorrente " + "(nomedono, saldo, limite, investimento)" + "VALUES (?,?,?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, corrente.getNm_nomeDono());
			stmt.setInt(2, corrente.getNr_saldo());
			stmt.setInt(3, corrente.getNr_limite());
			stmt.setBoolean(4,corrente.isNr_investimento());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<ContaCorrente> getLista() {
		List<ContaCorrente> correntes = new ArrayList<ContaCorrente>();

		String sql = "SELECT * FROM contacorrente";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ContaCorrente corrente = new ContaCorrente();
				corrente.setId(rs.getLong("id"));
				corrente.setNm_nomeDono(rs.getString("nomeDono"));
				corrente.setNr_saldo(rs.getInt("saldo"));
				corrente.setNr_limite(rs.getInt("limite"));
				corrente.setNr_investimento(rs.getBoolean("investimento"));

				correntes.add(corrente);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return correntes;

	}
	public void deletarConta() {
		String sql = "delete FROM contacorrente";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deletarNumeroConta(int id) {
		String sql = "delete from contacorrente where id = ? ";

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
