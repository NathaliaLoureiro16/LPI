package br.fundatec.lp1.exeBD02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp1.exeBD02.Pessoa;

public class PessoaDao {

		private Connection con;

		public PessoaDao(Connection con) {
			super();
			this.con = con;
		}

		public void adiciona(Pessoa pessoa) {
			String sql = "INSERT INTO pessoa " + "(nome, cpf, profissao, idade)" + "VALUES (?,?,?,?)";

			try {
				PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1, pessoa.getNm_nome());
				stmt.setString(2, pessoa.getNr_cpf());
				stmt.setString(3, pessoa.getDs_profissao());
				stmt.setInt(4,pessoa.getNr_idade());

				stmt.execute();
				stmt.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

		public List<Pessoa> getLista() {
			List<Pessoa> pessoas = new ArrayList<Pessoa>();

			String sql = "SELECT * FROM pessoa";

			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();

				while (rs.next()) {
					Pessoa pessoa = new Pessoa();
					pessoa.setId(rs.getLong("id"));
					pessoa.setNm_nome(rs.getString("nome"));
					pessoa.setNr_cpf(rs.getString("cpf"));
					pessoa.setDs_profissao(rs.getString("profissao"));
					pessoa.setNr_idade(rs.getInt("idade"));

					pessoas.add(pessoa);

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return pessoas;

		}
		
		public void deletarpessoas() {
			String sql = "delete FROM pessoa";

			try {
				PreparedStatement stmt = con.prepareStatement(sql);

				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void deletarCPF(String cpf) {
			String sql = "Delete from pessoa where cpf = ? ";

			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, cpf);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


}
