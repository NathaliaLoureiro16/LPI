package br.fundatec.lp1.exe03;

/**
 * Classe que representa uma Lampada Led.
 * @author Nathalia, TI11
 *
 */

public class Led implements Lamp {
	private int kwh;
	private int powerRating;
	private String status;
	private String typeAorB;

	public int getKwh() {
		return kwh;
	}

	public int getPowerRating() {
		return powerRating;
	}

	public String getStatus() {
		return status;
	}

	public String getTypeAorB() {
		return typeAorB;
	}

	public Led(int kwh, int powerRating, String status, String typeAorB) {
		super();
		this.kwh = kwh;
		this.powerRating = powerRating;
		this.status = status;
		this.typeAorB = typeAorB;
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
		if (this.typeAorB.equals("A")) {
			return (this.kwh * this.powerRating) * 0.4;
		}
		return (this.kwh * this.powerRating) * 0.5;
		
	}
}
