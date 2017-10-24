package br.fundatec.lp1.exeBD02;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp1.exeBD01.ConnectionFactory;
import br.fundatec.lp1.exeBD02.Pessoa;

public class AppTest {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().fabricante();
		System.out.println("CONECTADO!!");
		PessoaDao pDao = new PessoaDao(con);
		
		//inicio
				Pessoa pessoa = new Pessoa();
				pessoa.setNm_nome("Nathalia");
				pessoa.setNr_cpf("02098072023");
				pessoa.setDs_profissao("aluna");
				pessoa.setNr_idade(19);
				
				Pessoa pessoa2 = new Pessoa();
				pessoa2.setNm_nome("Joao");
				pessoa2.setNr_cpf("09080706050");
				pessoa2.setDs_profissao("aluno");
				pessoa2.setNr_idade(17);
				
				Pessoa pessoa3 = new Pessoa();
				pessoa3.setNm_nome("Arthur");
				pessoa3.setNr_cpf("01020304050");
				pessoa3.setDs_profissao("aluno");
				pessoa3.setNr_idade(20);
				
			
				/*pDao.adiciona(pessoa);
				pDao.adiciona(pessoa2);
				pDao.adiciona(pessoa3);*/
				//fim
				
				//iniciodeletecpf
				pDao.deletarCPF("01020304050");
				//fimdeletecpf
				
				//iniciodeletapessoa
				//pDao.deletarpessoas();
				//fimdeltapessoa
				

				//inicio
				List<Pessoa> pessoas= new ArrayList<Pessoa>();
				pessoas = pDao.getLista();
				for(Pessoa cont : pessoas) {
					System.out.println("ID: " +cont.getId());
					System.out.println("Nome: " +cont.getNm_nome());
					System.out.println("Cpf: " +cont.getNr_cpf());
					System.out.println("Profissao: " +cont.getDs_profissao());
					System.out.println("Idade: " +cont.getNr_idade()+"\n");
				}
				//fim
					
				con.close();
			}
	}

