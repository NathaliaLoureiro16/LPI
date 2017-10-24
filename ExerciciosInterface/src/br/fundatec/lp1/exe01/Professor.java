package br.fundatec.lp1.exe01;

/**
 * Classe que cria professor
 * @author Nathalia, TI11
 *
 */

public class Professor implements Print{
	private String nm_name;
	private String nr_cpf;
	private int nr_printQuota;
	private double salary;

	public Professor(String nm_name, String nr_cpf, int nr_printQuota, double salary) {
		super();
		this.nm_name = nm_name;
		this.nr_cpf = nr_cpf;
		this.nr_printQuota = nr_printQuota;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public String getNm_name() {
		return nm_name;
	}

	public String getNr_cpf() {
		return nr_cpf;
	}

	public int getNr_printQuota() {
		return nr_printQuota;
	}

	@Override
	public void addPrintQuota(int addPrintQuota) {
		this.nr_printQuota = this.nr_printQuota + addPrintQuota + 20;
		
		
	}
	
}
