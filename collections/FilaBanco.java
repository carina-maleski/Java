/*Escreva um programa Java
 contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..

 * */
package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> banco = new LinkedList<String>();
		int op=0;
		
		do {
			System.out.println("\n-------------");
			System.out.println("\nMenu de opções:");
			System.out.println("\n1- Adicionar Cliente na Fila");
			System.out.println("\n2- Listar todos os Clientes");
			System.out.println("\n3- Chamar próximo Cliente da Fila.");
			System.out.println("\n0- Sair. ");
			System.out.println("\n-------------");
			System.out.println("\nEntre com a opção desejada:");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome: ");
				banco.add(leia.nextLine());
				System.out.println("\nFila: "+banco+"\nCliente adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Clientes na Fila: \n"+banco);
				break;
			case 3:
				if(banco.isEmpty()) {
					System.out.println("A Fila está vazia!");
					}else {
						banco.remove();
						System.out.println("\nO próximo da fila foi chamado.\nFila: "+banco);	
					}
				break;
			case 0:
				leia.nextLine();
				System.out.println("\nPrograma Finalizado!");
				break;
				default:
					System.out.println("\nOpção inválida.");
			}
			
		}while(op != 0);
		
		System.out.println("\nFila: "+banco);
		
		System.out.println("\nFim.");

	}

}
