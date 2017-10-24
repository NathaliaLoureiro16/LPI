package br.fundatec.lp1.devices;

import java.util.Random;
/**
 * Classe que representa o sensor de movimento.
 * @author Nathalia
 *
 */
public class MotionSensor implements DeviceReturnString, DetectPeople {
	private String ds_status;
	private boolean bol_detect;

	public MotionSensor() {
		this.ds_status = "On";
		detectPeople();
	}

	public boolean isBol_detect() {
		return bol_detect;
	}

	public void setDs_status(String ds_status) {
		this.ds_status = ds_status;
	}

	@Override
	public String generateData() {
		return ds_status;

	}

	@Override
	public void detectPeople() {
		Random ran = new Random();
		this.bol_detect = ran.nextBoolean();

	}

}
