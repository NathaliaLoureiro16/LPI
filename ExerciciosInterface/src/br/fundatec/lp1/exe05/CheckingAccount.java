package br.fundatec.lp1.exe05;

/**
 * Classe criando conta corrente
 * @author Nathalia TI11
 *
 */
public class CheckingAccount implements Account, Application {
	private int balance;
	private int PercentageRate;

	public CheckingAccount(int balance, int percentageRate) {
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
		this.balance = this.balance - value;
	}

	@Override
	public void appliesValue() {
		this.balance = this.balance + (this.balance * this.PercentageRate/100);
		
	}

	@Override
	public void modifiesApplication() {
		this.PercentageRate = this.PercentageRate * 2;
		
		
	}

}
