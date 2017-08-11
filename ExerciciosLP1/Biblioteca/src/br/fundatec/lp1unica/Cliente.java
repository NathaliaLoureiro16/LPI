package br.fundatec.lp1unica;

public class Cliente {
	private String ds_nome;
	private String ds_documento;
	private Livro ds_livro;
	
	
	public Cliente(String ds_nome) {
		super();
		this.ds_nome = ds_nome;
		
	}
	
	public String getDs_documento() {
		return ds_documento;
	}


	public void setDs_documento(String ds_documento) {
		this.ds_documento = ds_documento;
	}


	public Livro getDs_livro() {
		return ds_livro;
	}


	public void setDs_livro(Livro ds_livro) {
		this.ds_livro = ds_livro;
	}


	public String getDs_nome() {
		return ds_nome;
	}


	
	

}
