package br.fundatec.lp1.exeBD01;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AppTest {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().fabricante();
		System.out.println("CONECTADO!!");
		ContatoDao cDao = new ContatoDao(con);
		
		//inicio
		Contato contato = new Contato();
		contato.setNm_contato("arthur");
		contato.setDs_email("123456@1234.com");
		contato.setDs_endereco("Rua do arvoredo");
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		contato.setDt_nascimento(calendar);
		
		//cDao.adiciona(contato);
		//fim
		
		
		
		//iniciodelete
		//cDao.deletar();
		//fimdelete
		
		//iniciodeleteNome
		cDao.deletarNmPessoa("maria");
		//fimdeleteNome
		
		//inicio
		List<Contato> contatos= new ArrayList<Contato>();
		contatos = cDao.getLista();
		for(Contato cont : contatos) {
			System.out.println("ID: " +cont.getId());
			System.out.println("Nome: " +cont.getNm_contato());
			System.out.println("Email: " +cont.getDs_email());
			System.out.println("Endereço: " +cont.getDs_endereco());
			System.out.println("Data de Nascimento: " +cont.getDt_nascimento().getTime()+"\n");
		}
		//fim
		
		
		con.close();
	}
		
	}



