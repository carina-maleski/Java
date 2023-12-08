/*Escreva um algoritmo em Java que leia números inteiros via teclado até que o número zero seja digitado. 
Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.

*/

package lacosderepeticao;

import java.util.Scanner;

public class SomaDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, resul =0;
		
		do {
			
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			if(numero > 0) {
				resul += numero;
			}
			
		}while (numero != 0);
		
		leia.close();
		System.out.println("\nA soma dos números positivos é: "+resul);
	}

}
