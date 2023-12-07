/* Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples. O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!*/

package lacos_condicionais_java;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		float numero1, numero2, resul;
		int cod;
		String op = "inicial";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscolha o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("\nEscolha o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("\nEscolha a operação matemática que deseja realizar: \r1- Soma \r2- Subtração \r3- Multiplicação \r4- Divisão\n");
		cod = leia.nextInt();
		
		resul = 0f;
		
		switch(cod) {
		case 1: //
			op = "Soma";
			resul = numero1 + numero2;
			break;
		case 2: //
			op = "Subtração";
			resul = numero1 - numero2;
			break;
		case 3: //
			op = "Multiplicação";
			resul = numero1 * numero2;
			break;
		case 4: //
			op = "Divisão";
			resul = numero1 / numero2;
			break;
			default:
				System.out.println("Operação Inválida!");
		}
		
		System.out.println("\nO resultado da "+op+" entre "+numero1+" e "+numero2+" é: "+resul);
	}

}
