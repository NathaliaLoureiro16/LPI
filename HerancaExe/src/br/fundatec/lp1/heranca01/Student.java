package br.fundatec.lp1.heranca01;

/**
 * A classe cria um estudante.
 * 
 * @author Nathalia T11
 */
public class Student extends People {
	protected int qtd_discipline;
	protected boolean bol_money;

	public Student(String nm_name, String nr_cpf, int print, int qtd_discipline, boolean bol_money) {
		super(nm_name, nr_cpf, print);
		this.qtd_discipline = qtd_discipline;
		this.bol_money = bol_money;

	}

	public int getQtd_discipline() {
		return qtd_discipline;
	}

	public boolean isBol_money() {
		return bol_money;
	}

	@Override
	public void AddPrint(int addprint) {
		this.print += addprint + 10;
	}

}
