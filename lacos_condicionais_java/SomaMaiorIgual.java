/*
 *Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.*/

package lacos_condicionais_java;

import java.util.Scanner;

public class SomaMaiorIgual {
	
	public static void main(String[] args) {
		
		int A, B, C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o número A: ");
		A = leia.nextInt();
		
		System.out.println("\nEntre com o número B: ");
		B = leia.nextInt();
		
		System.out.println("\nEntre com o número C: ");
		C = leia.nextInt();
		
		if (A + B > C) {
			System.out.println("\nA Soma de A + B é Maior do que C.");
		}else if (A+ B < C) {
			System.out.println("\nA Soma de A + B é Menor do que C.");
		}else {
			System.out.println("\nA Soma de A + B é Igual a C.");
		}
		
		leia.close();
	}

}
