/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3.*/

package lacosderepeticao;

import java.util.Scanner;

public class InteirosDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int escolha = 1, soma=0, cont=0;
		
		do {
			
			System.out.println("\nDigite um número: ");
			escolha = leia.nextInt();
			
			if (escolha % 3 == 0 && escolha != 0) {
				soma += escolha;
				cont++;
			}
			
		} while (escolha != 0);
		
		System.out.println(soma +" e " +cont);
		
		System.out.println("\nA média de todos os números múltiplos de 3 é: "+soma/cont);

	}

}
