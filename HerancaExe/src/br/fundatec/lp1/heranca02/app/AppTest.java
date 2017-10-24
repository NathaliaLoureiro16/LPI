package br.fundatec.lp1.heranca02.app;

import br.fundatec.lp1.heranca02.Directors;
import br.fundatec.lp1.heranca02.Intern;
import br.fundatec.lp1.heranca02.Juniors;
import br.fundatec.lp1.heranca02.Managers;
import br.fundatec.lp1.heranca02.Seniors;

/**
 * A classe testa as outras classes.
 * 
 * @author Nathalia T11
 */
public class AppTest {
	public static void main(String[] args) {
		Intern escravo = new Intern("Nathalia", "123456", 1500);
		Juniors junior = new Juniors("fulano", "654789", 2000);
		Seniors senior = new Seniors("ciclano", "987456", 2500);
		Managers managers = new Managers("aclano", "9852314", 3000);
		Directors diretor = new Directors("ciano", "65412358", 20000);
		
		System.out.println(escravo.getNm_name());
		System.out.println(escravo.getVl_salary());
		escravo.resetSalary();
		System.out.println(escravo.getVl_salary());
		
		System.out.println("");
		
		System.out.println(junior.getNm_name());
		System.out.println(junior.getVl_salary());
		junior.resetSalary();
		System.out.println(junior.getVl_salary());
		
		System.out.println("");
		
		System.out.println(senior.getNm_name());
		System.out.println(senior.getVl_salary());
		senior.resetSalary();
		System.out.println(senior.getVl_salary());
		
		System.out.println("");
		
		System.out.println(managers.getNm_name());
		System.out.println(managers.getVl_salary());
		managers.resetSalary();
		System.out.println(managers.getVl_salary());
		
		System.out.println("");
		
		System.out.println(diretor.getNm_name());
		System.out.println(diretor.getVl_salary());
		diretor.resetSalary();
		System.out.println(diretor.getVl_salary());
	}

}
