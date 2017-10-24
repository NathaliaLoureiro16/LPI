package br.fundatec.lp1.abstract02.App;

import br.fundatec.lp1.abstract02.Ancient;
import br.fundatec.lp1.abstract02.Normal;
import br.fundatec.lp1.abstract02.Partner;
import br.fundatec.lp1.abstract02.Student;


public class AppTest {
	public static void main(String[] args) {
		Student estudante = new Student(30);
		Ancient idoso = new Ancient(30);
		Partner socio = new Partner(30);
		Normal normal = new Normal(30);
		
		estudante.modifier();
		System.out.println(estudante.getNr_price()+ " De desconto!");
		
		idoso.modifier();
		System.out.println(idoso.getNr_price()+ " De desconto!");
		
		socio.modifier();
		System.out.println(socio.getNr_price()+ " De desconto!");
		
		normal.modifier();
		System.out.println(normal.getNr_price()+ " De desconto!");
	}
}
