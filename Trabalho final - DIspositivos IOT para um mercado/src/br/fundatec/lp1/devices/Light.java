package br.fundatec.lp1.devices;
/**
 * Classe que representa a luz.
 * @author Nathalia
 *
 */
public class Light implements DeviceReturnBoolean {
	private boolean bol_status;

	public void setBol_status(boolean bol_status) {
		this.bol_status = bol_status;
	}

	@Override
	public boolean deviceData() {
		return bol_status;
	}

}
