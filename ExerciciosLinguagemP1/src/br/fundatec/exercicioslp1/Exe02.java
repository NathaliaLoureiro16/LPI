package br.fundatec.exercicioslp1;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/*
		 * 2) Crie um programa que verifica qual n�mero � maior entre dois
		 * n�meros.
		 */

		int n1, n2;

		System.out.println("Entre com o primeiro numero");
		n1 = teclado.nextInt();

		System.out.println("Entre com o segundo numero");
		n2 = teclado.nextInt();

		if (n1 > n2) {
			System.out.println("O numero " + n1 + " � maior que o numero" + n2);

		} else {
			System.out.println("O numero " + n2 + " � maior que o numero " + n1);
		}

	}
}
