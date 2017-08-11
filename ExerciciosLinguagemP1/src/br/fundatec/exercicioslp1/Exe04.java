package br.fundatec.exercicioslp1;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		/*
		 * 4) Crie um programa que verifica se um número é par ou ímpar
		 * 
		 */
		
		int n1;
		
		System.out.println("Entre com o numero");
		n1 = teclado.nextInt();
		
		if(n1%2==0){
			System.out.println("par");
		}else{
			System.out.println("impar");
		}

	}
}
