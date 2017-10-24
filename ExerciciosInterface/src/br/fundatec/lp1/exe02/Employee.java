package br.fundatec.lp1.exe02;

/**
 * Classe que cria um empregado.
 * @author Nathalia, TI11
 *
 */

public class Employee implements Salary, Sector {
	private int workedHours;
	private int valHour;
	private String sector;

	public Employee(int workedHours, int valHour, String sector) {
		super();
		this.workedHours = workedHours;
		this.valHour = valHour;
		this.sector = sector;
	}

	@Override
	public int CalculateSalary() {
		int salary = (this.workedHours * this.valHour) * 20;
		return salary;
	}

	@Override
	public void ChangeSector() {
		if (this.sector.equals("vendas") || this.sector.equals("caixa")) {
			this.sector = "estoque";
		} else if (this.sector.equals("estoque")) {
			this.sector = "vendas";
		}

	}

	@Override
	public void AttSector() {
		this.sector = "caixa";

	}

}
