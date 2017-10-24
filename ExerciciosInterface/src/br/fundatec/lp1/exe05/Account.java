package br.fundatec.lp1.exe05;

/**
 * Interface de conta
 * @author Nathalia TI11
 *
 */
public interface Account {

	/**
	 * Deposita valor
	 * @param value
	 * Valor a ser depositado
	 * 
	 */
	public void deposit(int value);

	/**
	 * Retira valor
	 * @param value
	 * Valor a ser retirado
	 */
	public void cashOut(int value);

}
