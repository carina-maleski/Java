package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EncontreInteiro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		List<Integer> esconde = new ArrayList<Integer>();
		
		for (int i=0;i<10;i++) {
			esconde.add(i+1);			
		}
		
		System.out.println(esconde);
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int digitado = leia.nextInt();
				
		if(esconde.contains(digitado)) {
			System.out.println("\nO número "+digitado+" está localizado na posição: "+esconde.indexOf(digitado));
		}else {
			System.out.println("\nO número "+digitado+" não foi encontrado!");
		}
		
	}

}
