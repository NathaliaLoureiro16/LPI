package br.fundatec.lp1.abstract01;

public class Table extends Fitment {
	protected String ds_format;

	public Table(String nr_codigo, int nr_valor) {
		super(nr_codigo, nr_valor);

	}

	public String getDs_format() {
		return ds_format;
	}

	public void setDs_format(String ds_format) {
		this.ds_format = ds_format;
	}

}
