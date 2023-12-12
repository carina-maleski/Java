/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList.
Em seguida, faça o que se pede:
Mostre na tela todas as cores que foram adicionadas. 
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
*/

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<String> cores = new ArrayList<String>();
		
		for(int i=0;i<5;i++) {
			System.out.println("\nDigite a "+(i+1)+"ª cor:");
			String entrada = leia.nextLine();
			cores.add(entrada);
		}
		
		System.out.println("\nListar todas as cores:\n"+cores);
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores:\n"+cores);
	}

}
