/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
Todos os elementos da Diagonal Principal; 
Todos os elementos da Diagonal Secundária; 
A Soma de todos os elementos da Diagonal Principal; 
A Soma de todos os elementos da Diagonal Secundária.
*/

package arrays;

import java.util.Scanner;

public class MatrizDiagonais {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int mat[][]= new int[3][3];
		int diagonalPrincipal[] = new int[3];
		int diagonalSecundaria[] = new int[3];		
		int linha=0,coluna=0,x=0,somaPrincipal=0,somaSecundaria=0;

		/*Matriz:
		 * 0,0		0,1		0,2
		 * 1,0		1,1		1,2
		 * 2,0		2,1		2,2	
		 * */
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++){
				System.out.println("\nDigite o número da posição "+linha+","+coluna+": ");
				mat[linha][coluna] = leia.nextInt();

				if(linha==coluna) {
					diagonalPrincipal[linha] = mat[linha][coluna];
					somaPrincipal += diagonalPrincipal[linha];
				}
				
				if(linha+coluna == mat.length-1) {
					diagonalSecundaria[linha] = mat[linha][coluna];
					somaSecundaria += diagonalSecundaria[linha];
				}
				
			}
		}
				
		System.out.println("\nElementos da Diagonal Principal:");
		for(x=0;x<3;x++) {
			System.out.println(diagonalPrincipal[x]);
		}

		System.out.println("\nElementos da Diagonal Secundária:");
		for(x=0;x<3;x++) {
		System.out.println(diagonalSecundaria[x]);
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: "+somaPrincipal);
		
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: "+somaSecundaria);
		
		System.out.println("\n---------");
		
		System.out.println("\nSua matriz: \n\n\t"+mat[0][0]+"\t"+mat[0][1]+"\t"+mat[0][2]+"\n\t"+mat[1][0]+"\t"+mat[1][1]+"\t"+mat[1][2]+"\n\t"+mat[2][0]+"\t"+mat[2][1]+"\t"+mat[2][2]);
		
		System.out.println("\nFim.");
	}
}
