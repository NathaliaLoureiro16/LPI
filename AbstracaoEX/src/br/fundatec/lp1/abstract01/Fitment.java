package br.fundatec.lp1.abstract01;

abstract class  Fitment {
	protected String nr_code;
	protected int nr_val;
	
	public Fitment(String nr_codigo, int nr_valor) {
		super();
		this.nr_code = nr_codigo;
		this.nr_val = nr_valor;
	}

	public String getNr_codigo() {
		return nr_code;
	}

	public int getNr_valor() {
		return nr_val;
	}
	

}
