package br.fundatec.lp1.exe04;
/**
 * Classe que cria uma figura geometrica quadrilátera.
 * @author Nathalia, TI11
 *
 */

public class Quadrilateral implements GeometricFigure {
	private int side1;
	private int side2;

	public Quadrilateral(int side1, int side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}

	public int getSide1() {
		return side1;
	}

	public int getSide2() {
		return side2;
	}

	@Override
	public int CalculateArea() {
		int area = this.side1 * this.side2;
		return  area;
	}

	@Override
	public String Namegeometric() {
		return "Quadrilateral";
	}

}
