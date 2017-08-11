package br.fundatec.exercicioslp1;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/*
		 * 1) Crie um programa que recebe a nota de um aluno e verifica se ele
		 * passou direto, ficou em exame ou foi reprovado. Para passar direto o
		 * aluno precisa ter nota igual superior a 7. Se ele tirar 3 ou mais e
		 * menos que 7 ficará em exame. Abaixo de 3 ele reprovará.
		 */

				int nota;
		
				System.out.println("Entre com a nota do aluno(a)");
				nota = teclado.nextInt();
		
				if (nota >= 7) {
					System.out.println("O aluno(a) foi aprovado");
		
				} else {
		
				if (nota >= 3 && nota < 7) {
						System.out.println("O aluno(a) ficará em exame");
		
				} else {
					System.out.println("O aluno(a) foi reprovado ");

			}
		}
	}
}