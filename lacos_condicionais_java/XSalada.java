/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.

 * */

package lacos_condicionais_java;

import java.util.Scanner;

public class XSalada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int escolha, qtd, total;
		
		System.out.println("Olá!! Menú de hoje:\n \r1- Cachorro Quente (R$10) \r2- X-Salada (R$15) \r3- X-Bacon (R$18) \r4- Bauru (R$12) \r5- Refrigerante (R$8) \r6- Suco de laranja (R$13)");
		
		System.out.println("\nDigite o número do produto que deseja verificar (1 a 6):");
		escolha = leia.nextInt();
		
		System.out.println("Digite a quantidade vendida:");
		qtd = leia.nextInt();
		
		total = 0;
		
		switch(escolha) {
		case 1: 
			System.out.println("Produto: Cachorro Quente");
			total = qtd * 10;
			break;
		case 2: 
			System.out.println("Produto: X-Salada");
			total = qtd * 15;
			break;
		case 3: 
			System.out.println("Produto: X-Bacon");
			total = qtd * 18;
			break;
		case 4: 
			System.out.println("Produto: Bauru");
			total = qtd * 12;
			break;
		case 5: 
			System.out.println("Produto: Refrigerante");
			total = qtd * 8;
			break;
		case 6: 
			System.out.println("Produto: Suco de laranja");
			total = qtd * 13;
			break;
			default: 
				System.out.println("Produto inexistente. Tente novamente.");
		}
		
		System.out.println("Valor total: R$"+total);
	}

}
