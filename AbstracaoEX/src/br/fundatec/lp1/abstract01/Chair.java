package br.fundatec.lp1.abstract01;

public class Chair extends Fitment {
	protected boolean rest_arm;

	public Chair(String nr_codigo, int nr_valor) {
		super(nr_codigo, nr_valor);
	}

	public boolean isRest_arm() {
		return rest_arm;
	}

	public void setRest_arm(boolean rest_arm) {
		this.rest_arm = rest_arm;
	}

}
