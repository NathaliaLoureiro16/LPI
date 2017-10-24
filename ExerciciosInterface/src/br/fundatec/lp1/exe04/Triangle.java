package br.fundatec.lp1.exe04;

/**
 * Classe que cria uma figura geometrica triangular.
 * @author Nathalia, TI11
 *
 */
public class Triangle implements GeometricFigure {
	private int base;
	private int height;


	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	

	public double getBase() {
		return base;
	}


	public double getHeight() {
		return height;
	}


	@Override
	public int CalculateArea() {
		int area = (int) ((this.base * this.height) / 2) ;
		return area;
	}

	@Override
	public String Namegeometric() {
		return "Triangle";
	}

}
