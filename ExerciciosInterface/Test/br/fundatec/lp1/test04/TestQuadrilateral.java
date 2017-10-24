package br.fundatec.lp1.test04;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lp1.exe04.Quadrilateral;
/**
 * Classe que testa metodos
 * @author Nathalia TI11
 *
 */
public class TestQuadrilateral {
	
	private Quadrilateral quadri;
	

	@Before
	public void setUp() throws Exception {
		Quadrilateral quadriAll = new Quadrilateral(2, 2);
		this.quadri = quadriAll;
	}

	@Test
	public void testQuadri() {
		Assert.assertEquals(4,quadri.CalculateArea());
		
	}

	@Test
	public void TestNameQuadri() {
	Assert.assertEquals("Quadrilateral", this.quadri.Namegeometric());
	}
}
