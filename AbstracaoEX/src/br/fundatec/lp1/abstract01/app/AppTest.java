package br.fundatec.lp1.abstract01.app;

import br.fundatec.lp1.abstract01.Chair;
import br.fundatec.lp1.abstract01.Couch;
import br.fundatec.lp1.abstract01.Ornament;
import br.fundatec.lp1.abstract01.Table;

public class AppTest {

	public static void main(String[] args) {
		Couch sofa = new Couch("12.548", 900);
		Chair cadeira = new Chair("020.658", 300);
		Ornament enfeite = new Ornament("080.557", 100);
		Table mesa = new Table("030.478", 200);
		
		sofa.setNr_seat(4);
		System.out.println("O sofa possui "+ sofa.getNr_seat() + " lugares");
		
		cadeira.setRest_arm(true);
		System.out.println("A cadeira possui descanso para os braços" + cadeira.isRest_arm());
		
		enfeite.setDs_material("plastico");
		System.out.println("O enfeite é de "+ enfeite.getDs_material());
		
		mesa.setDs_format("Quadrada");
		System.out.println("A mesa é  "+mesa.getDs_format());
		
		
	
		

	}
}
