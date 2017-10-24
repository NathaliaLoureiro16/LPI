package br.fundatec.lp1.exe04;

/**
 * Classe que cria uma figura geometrica circular.
 * @author Nathalia, TI11
 *
 */
public class Circle implements GeometricFigure {
	private int ray;

	public Circle(int ray) {
		super();
		this.ray = ray;
	}

	public int getRay() {
		return ray;
	}

	@Override
	public int CalculateArea() {
		int area = (int) (Math.pow(this.ray, 2) * Math.PI);
		return area;
	}


	@Override
	public String Namegeometric() {
		return "Circle";
	}

}
