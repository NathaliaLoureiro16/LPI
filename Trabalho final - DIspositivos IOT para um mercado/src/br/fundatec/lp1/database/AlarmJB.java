package br.fundatec.lp1.database;

import java.util.Calendar;

/**
 * Classe que representa o alarme no banco de dados.
 * @author Nathalia
 *
 */
public class AlarmJB {
	private long id;
	private Calendar change_time;
	private boolean bol_status;
	private boolean ringing;
	
	public boolean isRinging() {
		return ringing;
	}
	public void setRinging(boolean ringing) {
		this.ringing = ringing;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Calendar getChange_time() {
		return change_time;
	}
	public void setChange_time(Calendar change_time) {
		this.change_time = change_time;
	}
	public boolean isBol_status() {
		return bol_status;
	}
	public void setBol_status(boolean bol_status) {
		this.bol_status = bol_status;
	}

}
