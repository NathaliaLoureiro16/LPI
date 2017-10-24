package br.fundatec.lp1.test03;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lp1.exe03.Incandescent;
/**
 * Classe que testa metodos
 * @author Nathalia TI11
 *
 */
public class TestIncandescent {

	private Incandescent incandescent;
	
	@Before
	public void setUp() throws Exception {
		Incandescent incandescent = new Incandescent(5, 8, "on");
		this.incandescent = incandescent;
	}

	@Test
	public void testOn() {
		this.incandescent.On();
		Assert.assertEquals("Off",this.incandescent.getStatus());
	}
	@Test
	public void testOff() {
		this.incandescent.Off();
		Assert.assertEquals("On",this.incandescent.getStatus());
	}
	@Test
	public void testCalculateConsumption() {
		Assert.assertEquals(new Double(40),new Double(this.incandescent.CalculateConsumption()));
	}
}
