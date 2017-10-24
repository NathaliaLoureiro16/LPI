package br.fundatec.lp1.test04;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.fundatec.lp1.exe04.Triangle;
/**
 * Classe que testa metodos
 * @author Nathalia TI11
 *
 */
public class TestTriangle {
	
	private Triangle tri;
	
	@Before
	public void setUp() throws Exception {
		Triangle triAll = new Triangle(4, 8);
		this.tri = triAll;
	}

	@Test
	public void testTri() {
		Assert.assertEquals(16,tri.CalculateArea());
		
	}

	@Test
	public void TestNameTri() {
	Assert.assertEquals("Triangle", this.tri.Namegeometric());
	}
}
