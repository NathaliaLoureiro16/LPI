package br.fundatec.lp1.exe05;
/**
 * Classe criando conta poupança
 * @author Nathalia TI11
 *
 */
public class SavingsAccount implements Account, Application {
	private int balance;
	private int PercentageRate;

	public SavingsAccount(int balance, int percentageRate) {
		super();
		this.balance = balance;
		this.PercentageRate = percentageRate;
	}

	public int getBalance() {
		return balance;
	}

	public int getPercentageRate() {
		return PercentageRate;
	}

	@Override
	public void deposit(int value) {
		this.balance = this.balance + value;
	}

	@Override
	public void cashOut(int value) {
		this.balance = this.balance - (value + 5);
	}

	@Override
	public void appliesValue() {
		this.balance = this.balance + (this.balance * this.PercentageRate / 100);
		this.PercentageRate = this.PercentageRate * 2;

	}

	@Override
	public void modifiesApplication() {
		this.PercentageRate = this.PercentageRate * 3;

	}

}
