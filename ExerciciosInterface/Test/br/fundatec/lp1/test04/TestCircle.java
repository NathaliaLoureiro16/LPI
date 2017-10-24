package br.fundatec.lp1.test04;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lp1.exe04.Circle;
/**
 * Classe que testa metodos
 * @author Nathalia TI11
 *
 */
public class TestCircle {
	private Circle circle;

	@Before
	public void setUp() throws Exception {
		Circle circleAll = new Circle(20);
		this.circle = circleAll;
	}

	@Test
	public void testCircle() {
		Assert.assertEquals(1256,circle.CalculateArea());
		
	}

	@Test
	public void TestNameCircle() {
	Assert.assertEquals("Circle", this.circle.Namegeometric());
	}
}
