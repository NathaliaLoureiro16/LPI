package br.fundatec.lp1.heranca01.app;

import br.fundatec.lp1.heranca01.People;
import br.fundatec.lp1.heranca01.Professor;
import br.fundatec.lp1.heranca01.Student;

/**
 * Classe que testas as outras classes
 * @author Nathália
 *
 */
public class AppTest {
	
	public static void main(String[] args) {
		
	Professor professor = new Professor("Everton", "65898745636", 20, 16);
	Student student = new Student("Nathalia", "123456", 20, 4, true);
	System.out.println("Professor tinha: "+professor.getPrint());
	professor.AddPrint(10);
	System.out.println("Professor ficou: "+ professor.getPrint());
	System.out.println("Student tinha: "+ student.getPrint());
	student.AddPrint(10);
	System.out.println("Student ficou: "+student.getPrint());
		
	}

}
