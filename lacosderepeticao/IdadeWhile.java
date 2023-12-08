/*
 * Escreva um algoritmo em Java que
leia a idade de várias pessoas (números inteiros), via teclado
mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos.
A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo:

*/
package lacosderepeticao;

import java.util.Scanner;

public class IdadeWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 1, men =0, mai=0;

				
		while(idade >= 0) {

			System.out.println("\nDigite uma idade:");
			idade = leia.nextInt();
			
			if(idade >=0 && idade<21) {
				men++;
			} 
			if(idade>50) {
				mai++;
			} 
		
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: "+men);
		System.out.println("\nTotal de pessoas  maiores de 50 anos: "+mai);
		
		System.out.println("\nFim.");
		leia.close();
	}

}
