package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio06_2Times {

	/*
	 * 6) Ler o nome de 2 times e o número de gols marcados na partida (para cada
	 * time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser
	 * impressa a palavra EMPATE.
	 */

	public static void main(String[]Args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome do primeiro Time: ");
		String time01 = sc.next();
		
		System.out.println("Digite o nome do segundo Time: ");
		String time02 = sc.next();
		
		System.out.println("Digite o numero de gols marcado pelo o primeiro time: ");
		int golsTime01 = sc.nextInt();
		
		System.out.println("Digite o numero de gols marcado pelo o segundo Time: ");
		int golstime02 = sc.nextInt();
		
		
		if(golsTime01 > golstime02) {
			System.out.println("O time "+time01+" Ganhou a partida.");
			System.out.println("O placar foi "+time01+golsTime01+" X "+golstime02+time02);
		}else if(golstime02 > golsTime01) {
			System.out.println("O time "+time02+" Ganhou a partida.");
			System.out.println("O placar foi "+time02+golstime02+" X "+golsTime01+time01);
		}else if(golsTime01 == golstime02) {
			System.out.println("Os times empataram a partida.");
			System.out.println("O placar foi "+time02+golstime02+" X "+golsTime01+time01);
		}
		
		sc.close();
	}
}
