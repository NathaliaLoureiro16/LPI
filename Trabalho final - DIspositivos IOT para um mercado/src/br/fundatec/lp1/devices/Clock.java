package br.fundatec.lp1.devices;

import java.util.Random;
/**
 * Classe que representa o relogio.
 * @author Nathalia
 *
 */
public class Clock {
	private String hour;

	public Clock() {
		super();
		changeTime();
	}

	public void changeTime() {
		Random ran = new Random();
		if (ran.nextBoolean()) {
			this.hour = "Day";
		} else {
			this.hour = "Night";
		}
	}

	public String getHour() {
		return hour;
	}

}
