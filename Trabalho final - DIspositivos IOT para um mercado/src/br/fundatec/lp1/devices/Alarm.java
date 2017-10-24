package br.fundatec.lp1.devices;
/**
 * Classe que representa o alarme.
 * @author Nathalia
 *
 */
public class Alarm implements DeviceReturnBoolean{

	private boolean bol_status;
	private boolean ringing;

	public Alarm() {
		super();
		dingAlarm(false);
		this.bol_status = true;
	}
	
	public void setDs_status(boolean ds_status) {
		this.bol_status = ds_status;
	}
	
	public boolean isRinging() {
		return ringing;
	}

	public void dingAlarm(boolean toc){
		this.ringing = toc;
		
		
	}
	
	@Override
	public boolean deviceData() {
		return bol_status;
	}

}
