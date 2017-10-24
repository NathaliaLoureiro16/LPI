package br.fundatec.lp1.test03;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lp1.exe03.Led;
/**
 * Classe que testa metodos
 * @author Nathalia TI11
 *
 */
public class TestLed {

	private Led led;

	@Before
	public void setUp() throws Exception {
		Led led = new Led(5, 8, "on", "A");
		this.led = led;

	}

	@Test
	public void testOn() {
		this.led.On();
		Assert.assertEquals("Off", this.led.getStatus());
	}

	@Test
	public void testOff() {
		this.led.Off();
		Assert.assertEquals("On", this.led.getStatus());
	}

	@Test
	public void testCalculateConsumption() {
		Assert.assertEquals(new Double(16), new Double(this.led.CalculateConsumption()));
	}
}
