package br.fundatec.lp1.database;

import java.util.Calendar;
/**
 * Classe que representa o sensor de movimento no banco de dados.
 * @author Nathalia
 *
 */
public class MotionSensorJB {
	private long id;
	private Calendar change_time;
	private String ds_status;
	private boolean detecting;
	
	
	public boolean isDetecting() {
		return detecting;
	}
	public void setDetecting(boolean detecting) {
		this.detecting = detecting;
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
	public String getDs_status() {
		return ds_status;
	}
	public void setDs_status(String ds_status) {
		this.ds_status = ds_status;
	}
	
	

}
