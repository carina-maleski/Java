/*
 * Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float). A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.*/

package lacos_condicionais_java;

import java.util.Scanner;

public class Colaborador {

	public static void main(String[] args) {
		
		String nome, cargo = "Nulo";
		int codCargo;
		float salario;
		
		Scanner leia = new Scanner(System.in);
		
		/* Entradas: Nome do colaborador: João da Silva / Cargo: 1 / Salário: R$ 10000.00 */
		
		System.out.println("\nNome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("\nCódigo do cargo (1 a 6): ");
		codCargo = leia.nextInt();
		
		System.out.println("\nSalário: ");
		salario = leia.nextFloat();
		
		/* Processamento dos dados */
		
		switch(codCargo) {
		case 1: 
			cargo = "Gerente";
			salario = (float) (salario * 1.10);
			break;
		case 2:
			cargo = "Vendedor";
			salario = (float) (salario * 1.07);
			break;
		case 3:
			cargo = "Supervisor";
			salario = (float) (salario * 1.09);
			break;
		case 4:
			cargo = "Motorista";
			salario = (float) (salario * 1.06);
			break;
		case 5:
			cargo = "Estoquista";
			salario = (float) (salario * 1.06);
			break;
		case 6:
			cargo = "Técnico de TI";
			salario = (float) (salario * 1.08);
			break;
			default:
				System.out.println("Código do cargo Inválido. Tente um número de 1 a 6.");
		}
		
		
		/* Saídas: Nome do colaborador: João da Silva / Cargo: Gerente / Salário: R$ 11000.00 */
		
		System.out.println("\nNome do colaborador: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.println("Salário ajustado (em reais): "+salario);
		
		leia.close();
	}

}
