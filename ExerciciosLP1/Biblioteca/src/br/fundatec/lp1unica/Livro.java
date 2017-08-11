package br.fundatec.lp1unica;

public class Livro {
	
	private String ds_titulo;
	private int nr_ano_publicacao;
	private Autor ds_autor;
	
	
	public Livro(String ds_titulo, Autor ds_autor) {
		super();
		this.ds_titulo = ds_titulo;
		this.ds_autor = ds_autor;
	}
	public int getNr_ano_publicacao() {
		return nr_ano_publicacao;
	}
	public void setNr_ano_publicacao(int nr_ano_publicacao) {
		this.nr_ano_publicacao = nr_ano_publicacao;
	}
	public String getDs_titulo() {
		return ds_titulo;
	}
	public Autor getDs_autor() {
		return ds_autor;
	}
	
	

}
