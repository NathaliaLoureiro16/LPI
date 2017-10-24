package br.fundatec.lp1.test02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lp1.exe02.Employee;

/**
 * Classe que testa metodos
 * @author Nathalia TI11
 *
 */
public class TestEmployeeTest {
	private Employee employeeAll;

	@Before
	public void setUp() throws Exception {
		Employee employee = new Employee(18, 10, "");
		this.employeeAll = employee;
	}

	@Test
	public void TestTheEmployeesSalary() {
		Assert.assertEquals(3600, this.employeeAll.CalculateSalary());
	}
}

