package br.fundatec.lp1.heranca01;

/**
 * A classe cria uma pessoa.
 * 
 * @author Nathalia T11
 */
public class People {
	protected String nm_name;
	protected String nr_cpf;
	protected int print;

	public People(String nm_name, String nr_cpf, int print) {
		super();
		this.nm_name = nm_name;
		this.nr_cpf = nr_cpf;
		this.print = print;
	}

	public String getNm_name() {
		return nm_name;
	}

	public String getNr_cpf() {
		return nr_cpf;
	}

	public int getPrint() {
		return print;
	}

	/**
	 * Metodo para adicionar impressao
	 * 
	 * @param addprint
	 *            Valo para aumentar
	 *
	 */
	public void AddPrint(int addprint) {
		this.print += addprint;

	}

}
