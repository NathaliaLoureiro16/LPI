package br.fundatec.exercicioslp1;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/*
		 * Faça um laço para mostrar os números de 1 a 200. Primeiramente um
		 * abaixo do outro, depois um do lado do outro.
		 * 
		 */

		for (int cont = 1; cont <= 200; cont++) {
			System.out.println(cont);
			
		}
			for (int conti = 1; conti <= 200; conti++){
				System.out.print(" ");
				System.out.print(conti);

		}
	}
}
