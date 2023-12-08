/*Escreva um algoritmo em Java que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares.*/

package lacosderepeticao;

import java.util.Scanner;

public class ParesImparesFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n, digitado, pares=0, impares=0;
		
		for(n=1;n<11;n++) {
			System.out.println("\nDigite o "+n+"º número: ");
			digitado = leia.nextInt();
			if(digitado%2==0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		leia.close();
		System.out.println("\nTotal de números pares: "+pares);
		System.out.println("\nTotal de números ímpares: "+impares);
		
		System.out.println("\nFim.");
	}

}
