package br.fundatec.lp1.abstract01;

public class Ornament extends Fitment {
	protected String ds_material;

	public Ornament(String nr_codigo, int nr_valor) {
		super(nr_codigo, nr_valor);

	}

	public String getDs_material() {
		return ds_material;
	}

	public void setDs_material(String ds_material) {
		this.ds_material = ds_material;
	}

}
