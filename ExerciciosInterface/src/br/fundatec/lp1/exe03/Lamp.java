package br.fundatec.lp1.exe03;

/**
* Classe de interface Lampada
* @author Nathalia 
*
*/

public interface Lamp {
	
	/**
	 * Liga a lampada
	 */
	public void On();
	
	/**
	 * Desliga a lampada
	 */
	public void Off();
	
	/**
	 * Calcula o consumo da lampada
	 */
	public double CalculateConsumption();
	
	

}
