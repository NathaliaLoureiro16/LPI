package br.fundatec.lp1.exe03;

/**
 * Classe que representa uma Lampada fluorescente.
 * @author Nathalia, TI11
 *
 */

public class Fluorescent implements Lamp {
	private int kwh;
	private int powerRating;
	private String status;

	public Fluorescent(int kwh, int powerRating, String status) {
		super();
		this.kwh = kwh;
		this.powerRating = powerRating;
		this.status = status;
	}

	public int getKwh() {
		return kwh;
	}

	public int getPowerRating() {
		return powerRating;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public void On() {
		this.status = "Off";
	}

	@Override
	public void Off() {
		this.status = "On";
	}

	@Override
	public double CalculateConsumption() {
		double consum = (this.kwh * this.powerRating) * 0.7;
		return consum;
	}
}
