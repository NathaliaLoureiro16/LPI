package br.fundatec.lp1.heranca02;
/**
 * A classe cria um professor.
 * 
 * @author Nathalia T11
 */
public class Intern extends Employee{

	public Intern(String nm_name, String nr_cpf, double vl_salary) {
		super(nm_name, nr_cpf, vl_salary);
		
	}

	@Override
	public void resetSalary() {
		super.resetSalary();
		this.vl_salary = this.vl_salary + 100;
	}

}
