/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.*/

package arrays;

import java.util.Scanner;

public class VetoresPosição {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[]= {2,5,1,3,4,9,7,8,10,6};
		int digitado, x;
		
		System.out.println("\nDigite um número de 1 a 10 para descobrir a posição respectiva dentro do vetor:");
		digitado = leia.nextInt();
		
		if(digitado > 0 && digitado <=10) {
			for(x=0;x<10;x++) {
				if(digitado==vet[x])
					System.out.println("\nO número "+digitado+" está localizado na posição: "+x);
			}
		}else {
			System.out.println("\nO número "+digitado+" não foi encontrado!");
		}
		leia.close();
		System.out.println("\nFim.");
	}

}
