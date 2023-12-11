/*Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
Todos os elementos dos índices ímpares do vetor 
Todos os elementos do vetor que são números pares
A Soma de todos os elementos do vetor
A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
*/


package arrays;

import java.util.Scanner;

public class VetorInteiros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[] = new int[10];
		int v, soma=0,cont=0;
		float media; 
		
		
		for(v=0;v<10;v++) {
			System.out.println("\nDigite o "+(v+1)+"º número: ");
			vet[v]=leia.nextInt();
			soma += vet[v];
			cont++;
		}
		
		media = soma/cont;
		
		System.out.println("\nElementos nos índices ímpares: ");
		for(v=0;v<10;v++) {
			if(v%2==1)
				System.out.println(vet[v]+"; ");
		}
				
		System.out.println("\nElementos pares: ");
		for(v=0;v<10;v++) {
			if(vet[v]%2==0)
				System.out.println(vet[v]+"; ");
		}
		
		System.out.println("\nSoma: "+soma);
		
		System.out.println("\nMédia: "+media);
	}

}
