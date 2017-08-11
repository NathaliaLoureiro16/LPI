package br.fundatec.exercicioslp1;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/*
		 * 3) Crie um programa que mostra o maior e menor número entre três
		 * números.
		 */

		int n1, n2, n3;

		System.out.println("Entre com o primeiro numero");
		n1 = teclado.nextInt();

		System.out.println("Entre com o segundo numero");
		n2 = teclado.nextInt();

		System.out.println("Entre com o terceiro numero");
		n3 = teclado.nextInt();

		if (n1 > n2 && n1 > n3) {
			if (n2 > n3) {
				System.out.println(n1 + ": Maior " + n3 + ": Menor");
			} else {
				System.out.println(n1 + ": Maior " + n2 + ": Menor");
			}
		}
		if (n2 > n1 && n2 > n3) {
			if (n1 > n3) {
				System.out.println(n2 + ": Maior " + n3 + ": Menor");
			} else {
				System.out.println(n2 + ": Maior " + n1 + ": Menor");
			}
		}
		if(n3 > n1 && n3 > n2){
			if(n2 > n1){
				System.out.println(n3 + ": Maior " + n1 + ": Menor");
			} else {
				System.out.println(n3 + ": Maior " + n2 + ": Menor");
			}
		}
	}
}