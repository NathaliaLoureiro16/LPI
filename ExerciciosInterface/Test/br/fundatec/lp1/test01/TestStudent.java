package br.fundatec.lp1.test01;

import static org.junit.Assert.*;
/**
 * Classe que testa metodos
 * @author Nathalia TI11
 *
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import br.fundatec.lp1.exe01.Student;

public class TestStudent {
	private Student studentAll;

	@Before
	public void setUp() throws Exception {
		Student studant = new Student("Nathalia","987456321", 10);
		this.studentAll = studant;
	}

	@Test
	public void ShouldTestStudentsQuota() {
		studentAll.addPrintQuota(10);
		Assert.assertEquals(30, studentAll.getNr_printQuota());
	}
}
