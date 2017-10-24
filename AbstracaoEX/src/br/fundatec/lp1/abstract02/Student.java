package br.fundatec.lp1.abstract02;

public class Student extends Ticket {

	public Student(double nr_price) {
		super(nr_price);
		
	}

	public void modifier(){
		this.nr_price = this.nr_price - (this.nr_price *0.40);
	}
}
