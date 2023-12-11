/*Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz serão as notas de um participante. Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.*/

package arrays;

import java.util.Scanner;

public class MatrizMedias {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float notas[][]= new float[10][4];
		float med[]= new float[10];
		float soma[]= new float[10];
		int linha,coluna,m;
		
			
			for(linha=0;linha<10;linha++) {
				
				for(coluna=0;coluna<4;coluna++) {
				
				System.out.println("\nEntre com a nota "+(coluna+1)+" do "+(linha+1)+"º aluno:");
				notas[linha][coluna] = leia.nextFloat();
				
				soma[linha] += notas[linha][coluna];
				}
				
				med[linha]=soma[linha]/4;
			}
		
		System.out.println("\nMédias: ");
		for(m=0;m<10;m++) {
			System.out.println(med[m]);
		}
		
		System.out.println("\nFim.");
	}

}
