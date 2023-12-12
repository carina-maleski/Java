/*
 * Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede: Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 
 * */

package collections;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class InteirosSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> setEntrada = new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
			System.out.println("\nEntre com o "+(i+1)+"º número: ");
			int entrada = leia.nextInt();
			setEntrada.add(entrada);
		}
		
		Iterator<Integer> iSetEntrada = setEntrada.iterator();
		System.out.println("\nListar dados do Set: ");
		while(iSetEntrada.hasNext()) {
			System.out.println(iSetEntrada.next());
		}
	}
	
	

}
