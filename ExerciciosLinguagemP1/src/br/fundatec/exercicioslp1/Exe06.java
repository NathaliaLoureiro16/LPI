package br.fundatec.exercicioslp1;

import java.util.Scanner;

public class Exe06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/*
		 * Faça um programa que mostre apenas os números impares entre 1 e 200.
		 * Crie outro programa que mostre apenas os pares.
		 * 
		 */

		for (int cont = 1; cont <= 200; cont++) {
			System.out.println("");
			if (cont % 2 == 1) 
				System.out.println(+cont+" iMPAR ");
			}
			
			for (int conti = 1; conti <= 200; conti++) {
				System.out.println("");
				if (conti % 2 == 0) 
					System.out.println(+conti+" PAR ");

				}
			}
		}
	

