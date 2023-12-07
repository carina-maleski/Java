/*Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.*/

package lacos_condicionais_java;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String vertebra, classe, alimento;
		
		/* escolha1 = 1 vertebrado || 2 invertebrado
		 * escolha2 = 3 ave || 4 mamífero || 5 inseto || 6 anelídeo
		 * escolha3 = 7 carnívoro || 8 onívoro || 9 herbívoro || 10 hematófago
		 * águia = 1 && 3 && 7
		 * pomba = 1 && 3 && 8
		 * homem = 1 && 4 && 8
		 * vaca = 1 && 4 && 9
		 * pulga = 2 && 5 && 10
		 * lagarta = 2 && 5 && 9
		 * sanguessuga = 2 && 6 && 10
		 * minhoca = 2 && 6 && 8
		 */
		
		System.out.println("Olá!! Quer jogar um jogo? Primeiro, escolha Vertebrado ou Invertebrado.");
		vertebra = leia.nextLine();
		
		if (vertebra.equalsIgnoreCase("Vertebrado")) {//Vertebrados
			
			System.out.println("Agora, escolha Ave ou Mamífero.");
			classe = leia.nextLine();
			
			if (classe.equalsIgnoreCase("Ave")) { //Ave
				System.out.println("Por fim, escolha Carnívoro ou Onívoro.");
				alimento = leia.nextLine();
				
				if (alimento.equalsIgnoreCase("Carnívoro")) { //Carnívoro
					System.out.println("\nO seu animal é ÁGUIA! 🦅");
				} else { //Onívoro
					System.out.println("\nO seu animal é POMBA! 🕊️");
				}
			}else {//Mamífero
					System.out.println("Por fim, escolha Onívoro ou Herbívoro.");
					alimento = leia.nextLine();
					
					if (alimento.equalsIgnoreCase("Onívoro")) { //Onívoro
						System.out.println("\nO seu animal é HOMEM! 👨🏾");
					} else { //Herbívoro
						System.out.println("\nO seu animal é VACA! 🐄");
					}
			}
			
		}else { // Invertebrados
			System.out.println("Agora, escolha Inseto ou Anelídeo.");
			classe = leia.nextLine();
			
			if (classe.equalsIgnoreCase("Inseto")) { //Inseto
				System.out.println("Por fim, escolha Hematófago ou Herbívoro.");
				alimento = leia.nextLine();
				
				if (alimento.equalsIgnoreCase("Hematófago")) { //Hematófago
					System.out.println("\nO seu animal é PULGA! 🪲");
				} else { //Herbívoro
					System.out.println("\nO seu animal é LAGARTA! 🐛");
				}
			}else {//Anelídeo
					System.out.println("Por fim, escolha Hematófago ou Onívoro.");
					alimento = leia.nextLine();
					
					if (alimento.equalsIgnoreCase("Hematófago")) { //Hematófago
						System.out.println("\nO seu animal é SANGUESSUGA! 🦐");
					} else { //Onívoro
						System.out.println("\nO seu animal é MINHOCA! 🪱");
					}
			}
		}

	}

}
