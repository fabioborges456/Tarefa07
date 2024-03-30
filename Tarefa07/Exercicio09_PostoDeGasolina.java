package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio09_PostoDeGasolina {

	/*
	 * 9) Escreva um algoritmo que leia o número de litros vendidos e o tipo de
	 * combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e
	 * imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
	 * gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
	 */

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		String g_Gasolina = "Gasolina";
		String a_Alcool = "Alcool";

		System.out.println("Digite o combustivel desejado: ");
		String combustivel = sc.next();

		// Formulas para Calculo GASOLINA
		float litro = 3 * 3.30f / 100;
		float litroComDesconto = 3.30f - litro;
		float litroComDescontoAcima20 = 5 * 3.30f / 100;
		float valorFinalAcima20 = 3.30f - litroComDescontoAcima20;

		// Formula para Calculo Alcool
		float litroAlcool = 4 * 2.90f / 100;
		float litroAlcoolDesconto = 2.90f - litroAlcool;
		float litroAlcoolAcima20 = 6 * 2.90f / 100;
		float valorFinalLitroAcima20 = 2.90f - litroAlcoolAcima20;

		// Calculo para a Gasolina
		if (combustivel.equalsIgnoreCase(g_Gasolina)) {
			System.out.println("Foi escolhido o Combustivel " + g_Gasolina);
			System.out.println("Digite a quantidade Litros: ");
			float quantidade_Litros_Gasolina = sc.nextFloat();
			if (quantidade_Litros_Gasolina <= 20) {
				float valorFinal = quantidade_Litros_Gasolina * litroComDesconto;
				System.out.println("O valor Ficou R$ " + valorFinal);
			} else if (quantidade_Litros_Gasolina > 20) {
				float valorFinalAcima20_02 = quantidade_Litros_Gasolina * valorFinalAcima20;
				System.out.println("O valor Ficou R$ " + valorFinalAcima20_02);
			}

			// Calculo para o Alcool
		} else if (combustivel.equalsIgnoreCase(a_Alcool)) {
			System.out.println("Foi escolhido o Combustivel " + a_Alcool);
			System.out.println("Digite a quantidade de Litros: ");
			float quantidadeDeLitrosAlcool = sc.nextFloat();
			if (quantidadeDeLitrosAlcool <= 20) {
				float valorFinalAlcool = quantidadeDeLitrosAlcool * litroAlcoolDesconto;
				System.out.println("O valor Ficou R$ " + valorFinalAlcool);
			} else if (quantidadeDeLitrosAlcool > 20) {
				float valorFinalAlcoolAcima20_02 = quantidadeDeLitrosAlcool * valorFinalLitroAcima20;
				System.out.println("O valor Ficou R$ " + valorFinalAlcoolAcima20_02);
			}
		}

		sc.close();

	}
}
