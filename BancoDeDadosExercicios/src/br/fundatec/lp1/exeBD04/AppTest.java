package br.fundatec.lp1.exeBD04;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp1.exeBD01.ConnectionFactory;

public class AppTest {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().fabricante();
		System.out.println("CONECTADO!!");
		VendaDAO vDao = new VendaDAO(con);

	// inicio
		Venda venda = new Venda();
		venda.setNm_nomeComprador("Nathalia");
		venda.setNm_nomeVendedor("bill");
		venda.setNr_preco(50);
		venda.setNr_qtdItens(2);
		venda.setDs_formaPagamento("cartao de debito");
		//vDao.adiciona(venda);
		// fim
		
		// inicio
		Venda venda2 = new Venda();
		venda2.setNm_nomeComprador("Joao");
		venda2.setNm_nomeVendedor("tom");
		venda2.setNr_preco(20);
		venda2.setNr_qtdItens(4);
		venda2.setDs_formaPagamento("dinheiro");
		//vDao.adiciona(venda2);
		// fim
		
		// inicio
		Venda venda3 = new Venda();
		venda3.setNm_nomeComprador("Arthur");
		venda3.setNm_nomeVendedor("george");
		venda3.setNr_preco(500);
		venda3.setNr_qtdItens(1);
		venda3.setDs_formaPagamento("cartao de credito");
		//vDao.adiciona(venda3);
		// fim

		// inicio
		List<Venda> vendas = new ArrayList<Venda>();
		vendas = vDao.getLista();
		for (Venda cont : vendas) {
			System.out.println("ID: " + cont.getId());
			System.out.println("NomeComprador: " + cont.getNm_nomeComprador());
			System.out.println("NomeVendedor: " + cont.getNm_nomeVendedor());
			System.out.println("preço: " + cont.getNr_preco());
			System.out.println("qtdItens " + cont.getNr_qtdItens());
			System.out.println("formaPagamento: " + cont.getDs_formaPagamento() + "\n");
		}
		// fim
		
		//vDao.deletarvenda();
		//vDao.deletarvendedor("george");
		vDao.atualizarvenda("bill", 19);
		
		con.close();
	}
	
}
