/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.*/

package lacos_condicionais_java;

import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeira;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá!! Qual é o seu nome?");
		nome = leia.nextLine();
		
		System.out.println("Prazer em te conhecer, "+nome+". Qual é a sua idade?");
		idade = leia.nextInt();
		
		System.out.println("Obrigada! A sua idade é "+idade+". Essa é a sua Primeira doação de sangue? Digite True para sim, e False para não.");
		primeira = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 69) { 
			if (idade >=60 && idade <=69 && primeira == true) { 
			System.out.println(nome+" não está apto(a) para doar sangue!");
			}else{
				System.out.println(nome+" está apto(a) para doar sangue!");
			}
		}else {
			System.out.println(nome+" não está apto(a) para doar sangue!");
		}
		
	}

}
