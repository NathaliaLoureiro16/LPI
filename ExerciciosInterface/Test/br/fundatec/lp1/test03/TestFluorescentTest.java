package br.fundatec.lp1.test03;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.fundatec.lp1.exe03.Fluorescent;

/**
 * Classe que testa metodos
 * @author Nathalia TI11
 *
 */
public class TestFluorescentTest {

	private Fluorescent flu;
	
	@Before
	public void setUp() throws Exception {
		Fluorescent flu = new Fluorescent(2,2, "On");
		this.flu = flu;
	}

	@Test
	public void testOn() {
		this.flu.On();
		Assert.assertEquals("Off",this.flu.getStatus());
	}
	@Test
	public void testOff() {
		this.flu.Off();
		Assert.assertEquals("On",this.flu.getStatus());
	}
	@Test
	public void testCalculateConsumption() {
		Assert.assertEquals(new Double(2.8),new Double(this.flu.CalculateConsumption()));
	}
}
