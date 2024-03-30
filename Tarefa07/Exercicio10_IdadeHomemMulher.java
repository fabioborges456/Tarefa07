package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio10_IdadeHomemMulher {

	/*
	 * 10) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
	 * (considere que as idades dos homens serão sempre diferentes entre si, bem
	 * como as das mulheres). Calcule e escreva a soma das idades do homem mais
	 * velho com a mulher mais nova, e o produto das idades do homem mais novo com a
	 * mulher mais velha.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade do primeiro homem: ");
		int idade_Primeiro_Homem = sc.nextInt();
		System.out.println("Digite a idade do segundo homem: ");
		int idade_segundo_Homem = sc.nextInt();
		System.out.println("Digite a idade da primeiro mulher: ");
		int idade_Primeiro_Mulher = sc.nextInt();
		System.out.println("Digite a idade da segunda mulher: ");
		int idade_Segundo_Mulher = sc.nextInt();

		if (idade_Primeiro_Homem > idade_segundo_Homem && idade_Primeiro_Mulher > idade_Segundo_Mulher) {
			int somaHomemMaisVelhoComMulherMasNova = idade_Primeiro_Homem + idade_Segundo_Mulher;
			System.out
					.println("A soma do homem mas velho com a Mulher mas Nova é " + somaHomemMaisVelhoComMulherMasNova);
			int somaHomemMasNovoComMulherMasVelha = idade_segundo_Homem + idade_Primeiro_Mulher;
			System.out.println(
					"A soma da idade do homem mas novo, com a mulher mas velha e " + somaHomemMasNovoComMulherMasVelha);
		} else if (idade_segundo_Homem > idade_Primeiro_Homem && idade_Segundo_Mulher > idade_Primeiro_Mulher) {
			int somaHomem02MasvelhoComMulher01MasNova = idade_segundo_Homem + idade_Primeiro_Mulher;
			System.out.println(
					"A soma do homem mas velho com a Mulher mas Nova é " + somaHomem02MasvelhoComMulher01MasNova);
			int somaHomem01MasNovoComMulher02MasVelha = idade_Primeiro_Homem + idade_Segundo_Mulher;
			System.out.println("A soma da idade do homem mas novo, com a mulher mas velha e "
					+ somaHomem01MasNovoComMulher02MasVelha);
		}
		sc.close();
	}
}
