package br.fundatec.lp1.heranca02;
/**
 * A classe cria um professor.
 * 
 * @author Nathalia T11
 */
public class Managers extends Employee{

	public Managers(String nm_name, String nr_cpf, double vl_salary) {
		super(nm_name, nr_cpf, vl_salary);
	}

	@Override
	public void resetSalary() {
		this.vl_salary = this.vl_salary + (this.vl_salary*0.05);
		this.vl_salary = this.vl_salary + (this.vl_salary*0.18);
	}

}
