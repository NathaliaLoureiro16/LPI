package br.fundatec.lp1.database;
/**
 * Classe que representa a luz no banco de dados.
 * @author Nathalia
 *
 */
import java.util.Calendar;

public class LightJB {
	private long id;
	private Calendar change_time;
	private boolean bol_status;

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
