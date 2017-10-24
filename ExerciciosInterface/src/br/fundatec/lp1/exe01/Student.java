package br.fundatec.lp1.exe01;

/**
 * Classe que cria um estudante.
 * @author Nathalia T11
 *
 */
public class Student implements Print{
	private String nm_name;
	private String nr_cpf;
	private int nr_printQuota;


	public Student(String nm_name, String nr_cpf, int nr_printQuota) {
		super();
		this.nm_name = nm_name;
		this.nr_cpf = nr_cpf;
		this.nr_printQuota = nr_printQuota;
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
	public void addPrintQuota(int addPrinotQuta) {
		this.nr_printQuota = this.nr_printQuota + addPrinotQuta + 10;
		
		
	}
	
}
