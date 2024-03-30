package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio05_FormaTriangulo {

	/*
	 * 5) Ler 3 valores (A, B e C) representando as medidas dos lados de um
	 * triângulo e escrever se formam ou não um triângulo. OBS: para formar um
	 * triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
	 */

	public static void main(String[] Args) {

		Scanner entrada = new Scanner(System.in);
		int A, B, C;

		System.out.print("Verificador de Triângulo\n\n");

		System.out.print("Digite o lado A=");
		A = entrada.nextInt();

		System.out.print("Digite o lado B=");
		B = entrada.nextInt();

		System.out.print("Digite o lado C=");
		C = entrada.nextInt();

		if (A < B + C && B < A + C && C < A + B) {
			if (A == B && B == C) {
				System.out.print("O triângulo é Eqüilátero.");
			} else if (A == B || A == C || B == C) {
				System.out.print("O triângulo é Isósceles.");
			} else {
				System.out.print("O triângulo é Escaleno.");
			}
		} else {
			System.out.print("Os lados fornecidos não caracterizam um triângulo");
		}

		entrada.close();
	}
}
