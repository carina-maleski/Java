package collections;

import java.util.Scanner;
import java.util.Stack;

public class PilhaLivros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Stack<String> livros = new Stack<String>();
		int op;
		
		do {
			
			System.out.println("\n--------------");
			System.out.println("\nOpções:");
			System.out.println("\n1- Adicionar Livro na pilha");
			System.out.println("\n2- Listar todos os Livros");
			System.out.println("\n3- Retirar Livro da pilha");
			System.out.println("\n0- Sair");
			System.out.println("\n--------------");
			System.out.println("\nEntre com a opção desejada:");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do livro:");
				livros.push(leia.nextLine());
				System.out.println("\nLivro adicionado!\nSua pilha de livros: "+livros);
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha: "+livros);
				break;
			case 3:
				if(livros.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				}else {
					livros.pop();
					System.out.println("\nUm Livro foi retirado da pilha!\nSua pilha de livros: "+livros);
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado. Volte sempre!");
				break;
				default:
					System.out.println("\nOpção inválida! Tente novamente.");
			}
		}while(op != 0);
		
		System.out.println("\nSua pilha de livros: "+livros);
		System.out.println("\nFim.");
		
	}

}
