package br.fundatec.lp1unica.app;

import br.fundatec.lp1unica.Autor;
import br.fundatec.lp1unica.Cliente;
import br.fundatec.lp1unica.Livro;

public class App1 {
	
	public static void main(String[] args){
		
		Autor jose = new Autor("José de Alencar");
		Livro oGuarani = new Livro(" O Guarani" , jose);
		Cliente geromel = new Cliente("Geromel");
		
		geromel.setDs_livro(oGuarani);
		
		System.out.println(geromel.getDs_nome() + " retira o livro " +geromel.getDs_livro().getDs_titulo()+" de "+geromel.getDs_livro().getDs_autor().getDs_nome());
	}

}
