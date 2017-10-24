package br.fundatec.lp1.heranca02;

/**
 * A classe cria um professor.
 * 
 * @author Nathalia T11
 */
public class Employee {
	protected String nm_name;
	protected String nr_cpf;
	protected double vl_salary;

	public Employee(String nm_name, String nr_cpf, double vl_salary) {
		super();
		this.nm_name = nm_name;
		this.nr_cpf = nr_cpf;
		this.vl_salary = vl_salary;
	}

	public String getNm_name() {
		return nm_name;
	}

	public String getNr_cpf() {
		return nr_cpf;
	}

	public double getVl_salary() {
		return vl_salary;
	}

	public void resetSalary() {
		this.vl_salary = this.vl_salary + (this.vl_salary * 0.10);
	}

}
