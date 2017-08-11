package br.fundatec.lp1unica;

public class Carros {
	private String ds_marca;
	private Motorista ds_dono;
	private String ds_ano;
	
	public Carros(String ds_marca, Motorista ds_dono) {
		super();
		this.ds_marca = ds_marca;
		this.ds_dono = ds_dono;
	}

	public String getDs_ano() {
		return ds_ano;
	}

	public void setDs_ano(String ds_ano) {
		this.ds_ano = ds_ano;
	}

	public String getDs_marca() {
		return ds_marca;
	}

	public Motorista getDs_dono() {
		return ds_dono;
	}
	
	

}
