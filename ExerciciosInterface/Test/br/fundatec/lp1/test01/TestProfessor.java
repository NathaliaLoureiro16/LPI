package br.fundatec.lp1.test01;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lp1.exe01.Professor;

/**
 * Classe que testa metodos
 * @author Nathalia TI11
 *
 */
public class TestProfessor {

	private Professor professorAll;

	@Before
	public void setUp() throws Exception {
		Professor professor = new Professor("Thiago", "12345671089",10, 5000);
		this.professorAll = professor;
	}

	@Test
	public void ShouldTestProfessorQuota() {
		professorAll.addPrintQuota(20);
		Assert.assertEquals(50, professorAll.getNr_printQuota());
	}
}
