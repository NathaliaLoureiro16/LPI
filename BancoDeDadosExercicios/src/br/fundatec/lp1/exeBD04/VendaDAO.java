package br.fundatec.lp1.exeBD04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp1.exeBD04.Venda;

public class VendaDAO {
	private Connection con;

	public VendaDAO(Connection con) {
		this.con = con;
	}

	public void adiciona(Venda venda) {
		String sql = "INSERT INTO venda " + "(nomevendedor, nomecomprador, preco, qtditens,formapagamento)"
				+ "VALUES (?,?,?,?,?)";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, venda.getNm_nomeVendedor());
			stmt.setString(2, venda.getNm_nomeComprador());
			stmt.setFloat(3, venda.getNr_preco());
			stmt.setInt(4, venda.getNr_qtdItens());
			stmt.setString(5, venda.getDs_formaPagamento());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<Venda> getLista() {
		List<Venda> vendas = new ArrayList<Venda>();

		String sql = "SELECT * FROM venda";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Venda venda = new Venda();
				venda.setId(rs.getLong("id"));
				venda.setNm_nomeVendedor(rs.getString("nomevendedor"));
				venda.setNm_nomeComprador(rs.getString("nomecomprador"));
				venda.setNr_preco(rs.getInt("preco"));
				venda.setNr_qtdItens(rs.getInt("qtditens"));
				venda.setDs_formaPagamento(rs.getString("formapagamento"));

				vendas.add(venda);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vendas;

	}

	public void deletarvenda() {
		String sql = "delete FROM venda";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deletarvendedor(String nomevendedor) {
		String sql = "Delete from venda where nomevendedor = ? ";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nomevendedor);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void atualizarvenda(String novovendedor, long id) {
		String sql = "update venda set nomevendedor = ? where id = ?";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,novovendedor);
			stmt.setLong(2,id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

}
}
