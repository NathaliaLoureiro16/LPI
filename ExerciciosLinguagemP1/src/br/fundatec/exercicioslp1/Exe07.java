package br.fundatec.exercicioslp1;

import java.util.Scanner;

public class Exe07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/*
		 * Suponha que a popula��o da cidade A � de 8000 e tem taxa de crescimento 3%. 
		 * E a popula��o da cidade B � de 10000 e tem taxa de crescimento de 1,5%. 
		 * Em quantos anos a cidade A vai ultrapassar a cidade B em quantidade de popula��o?
		 */
		
		double nr_cidadeA = 8000, nr_cidadeB = 10000;
		int cont = 0;
		
		while(nr_cidadeA < nr_cidadeB){
			nr_cidadeA = nr_cidadeA + (nr_cidadeA * 0.03);
			nr_cidadeB = nr_cidadeB + (nr_cidadeB * 0.015);
			cont++;
		}
		System.out.println("Se passaram " + cont+ " anos");
	}
}

