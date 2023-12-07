/*
 * Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo.
 */

package lacos_condicionais_java;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		int escolha;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Oi! Digite um número para descobrir se ele é par ou ímpar, positivo ou negativo.");
		escolha = leia.nextInt();
		
		if (escolha % 2 == 0 && escolha > 0) {
			System.out.println("O Número " + escolha + " é par e positivo!");
		}else if (escolha % 2 == 1 && escolha > 0) {
			System.out.println("O Número " + escolha + " é ímpar e positivo!");
		}else if (escolha % 2 == 0 && escolha < 0) {
			System.out.println("O Número " + escolha + " é par e negativo!");
		}else {
			System.out.println("O Número " + escolha + " é ímpar e negativo!");
		}
		
		leia.close();
	}

}

