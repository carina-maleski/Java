package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EncontreSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);		
		Set<Integer> encontre = new HashSet<Integer>();
		encontre.add(2);
		encontre.add(5);
		encontre.add(1);
		encontre.add(3);
		encontre.add(4);
		encontre.add(9);
		encontre.add(7);
		encontre.add(8);
		encontre.add(10);
		encontre.add(6);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int digitado = leia.nextInt();
		if(encontre.contains(digitado)){
			System.out.println("\nO número "+digitado+" foi encontrado!");
		}else {
			System.out.println("\nO número "+digitado+" não foi encontrado!");
		}
		
	}

}
