/*Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e 3) e o valor a ser depositado ou sacado (somente nas opções 2 e 3). Considere que um saque só pode ser realizado caso haja saldo suficiente. Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o valor de R$ 1000.00. Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida
 **/

package lacos_condicionais_java;

import java.util.Scanner;

public class ContaBancaria {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int op;
		float saldo = 1000.0f;
		float saque=0f, deposito=0f;
		
		System.out.println("\nEscolha a operação que deseja realizar: \r1- Saldo \r2- Saque \r3- Depósito\n");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nOperação - Saldo \n\nSaldo: "+saldo);
			break;
		case 2:
			System.out.println("\nOperação - Saque \n\nValor: ");
			saque = leia.nextFloat();
			if (saque <= saldo) {
				saldo -= saque;
				System.out.println("\nNovo Saldo: "+ saldo);
			}else {
				System.out.println("\nSaldo Insuficiente!");
			}
			break;
		case 3:
			System.out.println("\nOperação - Depósito \n\nValor: ");
			deposito = leia.nextFloat();			
			saldo += deposito;
			System.out.println("\nNovo Saldo: "+ saldo);	
			break;
			default: 
				System.out.println("\nOperação Inválida!");
		}
		
		leia.close();
	}

}
