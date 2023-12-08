package lacosderepeticao;

import java.util.Scanner;

public class ColaboradorWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, genero, dev;
		int back=0, front=0, mobile=0, full=0;
		int mcis =0, mtrans=0, hcis=0, htrans=0, nb=0, outro=0, total=0, frontM=0, mobileH=0, fullNb=0;
		int soma=0;
		String continua = "S";
				
		while(continua.equals("S")) {
			
			System.out.println("\nIdade: ");
			idade = leia.nextInt();
			if(idade>0) {
				soma += idade;
			}
			System.out.println("\nGênero: ");
			genero = leia.nextInt();
			switch(genero) {
			case 1:
				mcis++;
				break;
			case 2:
				hcis++;
				break;
			case 3:
				nb++;
				break;
			case 4:
				mtrans++;
				break;
			case 5:
				htrans++;
				break;
			case 6:
				outro++;
				break;
				default:
					System.out.println("\nOpção de gênero inválida.");
			}
			
			System.out.println("\nPessoa Desenvolvedora: ");
			dev = leia.nextInt();
			switch(dev) {
			case 1:
				back++;
				break;
			case 2:
				front++;
				break;
			case 3:
				mobile++;
				break;
			case 4:
				full++;
				break;
				default:
					System.out.println("\nOpção de dev inválida.");
			}
			
			total++;
			
			if (genero == 1 || genero == 4) {
				if (dev == 2) {
					frontM++;
				}
			}
			
			if (genero == 2 || genero == 5) {
				if (dev == 3 && idade > 40) {
					mobileH++;
				}
			}
			
			if (genero == 3 && dev == 4 && idade < 30 ) {
					fullNb++;
			}
			
			System.out.println("\nDeseja continuar? (S/N)");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();
		}
		
				
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+back);
		System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: "+frontM);
		System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+mobileH);
		System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+fullNb);
		System.out.println("\nO número total de pessoas que responderam à pesquisa: "+total);
		System.out.println("\nA média de idade das pessoas que responderam à pesquisa: "+soma/total);
		
		
	}

}
