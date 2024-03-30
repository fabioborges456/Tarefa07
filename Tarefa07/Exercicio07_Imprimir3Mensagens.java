package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio07_Imprimir3Mensagens {

	/*
	 * 7) Ler dois valores e imprimir uma das três mensagens a seguir:
	 * 
	 * ‘Números iguais’, caso os números sejam iguais
	 * 
	 * ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
	 * 
	 * ‘Segundo maior’, caso o segundo seja maior que o primeiro.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor01 = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		int valor02 = sc.nextInt();

		if (valor01 == valor02) {
			System.out.println("Os numero são iguais");
		} else if (valor01 > valor02) {
			System.out.println("O primeiro valor e o maior");
		} else if (valor02 > valor01) {
			System.out.println("O segundo valor e o maior");
		}

		sc.close();
	}
}
