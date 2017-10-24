package br.fundatec.lp1.abstract02;

public class Partner extends Ticket{


	public Partner(double nr_price) {
		super(nr_price);
	}

	public void modifier(){
		this.nr_price = this.nr_price - (this.nr_price *0.25);
	}

}
