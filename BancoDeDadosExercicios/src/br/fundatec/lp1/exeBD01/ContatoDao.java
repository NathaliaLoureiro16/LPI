package br.fundatec.lp1.exeBD01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContatoDao {

	private Connection con;

	public ContatoDao(Connection con) {
		super();
		this.con = con;
	}

	public void adiciona(Contato contato) {
		String sql = "INSERT INTO contato " + "(nome, email, endereco, datanascimento)" + "VALUES (?,?,?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, contato.getNm_contato());
			stmt.setString(2, contato.getDs_email());
			stmt.setString(3, contato.getDs_endereco());
			stmt.setDate(4, new Date(contato.getDt_nascimento().getTimeInMillis()));

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<Contato> getLista() {
		List<Contato> contatos = new ArrayList<Contato>();

		String sql = "SELECT * FROM contato";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNm_contato(rs.getString("nome"));
				contato.setDs_email(rs.getString("email"));
				contato.setDs_endereco(rs.getString("endereco"));

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("datanascimento"));
				contato.setDt_nascimento(data);

				contatos.add(contato);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return contatos;

	}

	public void deletar() {
		String sql = "delete FROM contato";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deletarNmPessoa(String nome) {
		String sql = "Delete from contato where nome = ? "; 

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
