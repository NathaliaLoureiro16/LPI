package br.fundatec.lp1.abstract02;

public abstract class Ticket {
	protected double nr_price;
	
	public Ticket(double nr_price) {
		super();
		this.nr_price = nr_price;
	}

	public double getNr_price() {
		return nr_price;
	}

	abstract void modifier();
	
	
}
