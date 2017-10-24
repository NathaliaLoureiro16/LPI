package br.fundatec.lp1.abstract01;

public class Couch extends Fitment {
	protected int nr_seat;

	public Couch(String nr_codigo, int nr_valor) {
		super(nr_codigo, nr_valor);

	}

	public int getNr_seat() {
		return nr_seat;
	}

	public void setNr_seat(int nr_seat) {
		this.nr_seat = nr_seat;
	}

}
