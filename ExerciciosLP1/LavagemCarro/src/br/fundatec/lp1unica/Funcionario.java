package br.fundatec.lp1unica;

public class Funcionario {
	private String ds_nome;
	private Carros ds_carros;
	
	
	public Funcionario(String ds_nome) {
		super();
		this.ds_nome = ds_nome;
	}


	public Carros getDs_carros() {
		return ds_carros;
	}


	public void setDs_carros(Carros ds_carros) {
		this.ds_carros = ds_carros;
	}


	public String getDs_nome() {
		return ds_nome;
	}
	
	
	
}
