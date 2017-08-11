package br.fundatec.lp1unica;

public class Motorista {
	private String ds_nome;
	private String ds_documento;
	
	
	public Motorista(String ds_nome, String ds_documento) {
		super();
		this.ds_nome = ds_nome;
		this.ds_documento = ds_documento;
	}

	public String getDs_nome() {
		return ds_nome;
	}


	public String getDs_documento() {
		return ds_documento;
	}
	

}
