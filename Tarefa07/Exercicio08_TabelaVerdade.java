package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio08_TabelaVerdade {

	/*
	 * 8) Seja o seguinte algoritmo:
	 * 
	 * início
	 * 
	 * ler x
	 * 
	 * ler y
	 * 
	 * z <- (x*y) + 5
	 * 
	 * se z <= 0 então
	 * 
	 * resposta <- ‘A’
	 * 
	 * senão
	 * 
	 * se z <= 100 então
	 * 
	 * resposta <- ‘B’
	 * 
	 * senão
	 * 
	 * resposta <- ‘C’
	 * 
	 * fim_se
	 * 
	 * fim_se
	 * 
	 * escrever z, resposta
	 * 
	 * fim
	 * 
	 * Faça um teste de mesa e complete o quadro a seguir para os seguintes valores:
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de X: ");
		float valorX = sc.nextFloat();

		System.out.println("Digite o valor do Y: ");
		float valorY = sc.nextFloat();

		float valorZ = (valorX * valorY) + 5;

		if (valorZ <= 0) {
			System.out.println("A");
		} else if (valorZ <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

		sc.close();
	}
}
