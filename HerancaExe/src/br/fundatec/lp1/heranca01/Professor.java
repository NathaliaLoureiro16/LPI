package br.fundatec.lp1.heranca01;

/**
 * A classe cria um professor.
 * 
 * @author Nathalia T11
 */
public class Professor extends People {
	protected int hours;
	protected String schooling;

	public Professor(String nm_name, String nr_cpf, int print, int hours) {
		super(nm_name, nr_cpf, print);
		this.hours = hours;
	}

	public String getSchooling() {
		return schooling;
	}

	public void setSchooling(String schooling) {
		this.schooling = schooling;
	}

	public int getHours() {
		return hours;
	}

	@Override
	public void AddPrint(int addprint) {
		this.print += addprint + 30;
	}

}
