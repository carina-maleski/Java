/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.

/* && resul % 3 = 0 && resul % 5 = 0

*/

package lacosderepeticao;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, resul;
		
		/*Entrada de dados*/
		
		System.out.println("\nDigite o primeiro número do intervalo:");
		n1 = leia.nextInt();
		
		System.out.println("\nDigite o último número do intervalo:");
		n2 = leia.nextInt();
		leia.close();
		
		/*Processamento e Saída de dados*/
		
		if (n1 < n2) { //o primeiro número deve ser menor do que o segundo número
			
			System.out.println("\nNo Intervalo entre "+n1+" e "+n2+": ");
			
			for(resul = n1; resul < n2 ; resul++) { //repetição de cada número entre n1 e n2
				
				if(resul % 3 == 0 && resul % 5 == 0) {//condição de ser múltiplo de 3 e 5
					System.out.println(resul+" é múltiplo de 3 e 5");
				}else {
					System.out.println("\nNão há múltiplos de 3 e 5.");
				}
			}
			
		}else {
			System.out.println("\nIntervalo inválido!");
		}
		 
		System.out.println("\nFim.");
	}
}