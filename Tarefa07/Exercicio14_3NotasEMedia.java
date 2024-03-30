package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio14_3NotasEMedia {

	/*
	 * 14) Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3
	 * verificações e a média dos exercícios que fazem parte da avaliação. Calcular
	 * a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do
	 * aluno de acordo com a tabela de conceitos mais abaixo:
	 * 
	 * A atribuição de conceitos obedece a tabela abaixo:
	 */

	public static void main(String[]Args) {
		
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome do Aluno: ");
		String nomeAluno = sc.next();
		
		System.out.println("Digite a primeira nota do Aluno ("+nomeAluno+") :");
		float nota01 = sc.nextFloat();
		System.out.println("Digite a segunda nota do Aluno ("+nomeAluno+") :");
		float nota02 = sc.nextFloat();
		System.out.println("Digite a terceira nota do Aluno ("+nomeAluno+") :");
		float nota03 = sc.nextFloat();
		
		float mediasDasAvaliacoes = (nota01+nota02+nota03)/3;
		float media_de_Aproveitamento = (nota01+(nota02*2)+(nota03*3)+mediasDasAvaliacoes)/7;
		
		if(media_de_Aproveitamento >= 9.00f) {
			System.out.println("A media de Aproveitamento do Aluno ("+nomeAluno+") : "+media_de_Aproveitamento);
			System.out.println("Conceito : A");
		}else if(media_de_Aproveitamento >= 7.50f && media_de_Aproveitamento < 9.00f) {
			System.out.println("A media de Aproveitamento do Aluno ("+nomeAluno+") : "+media_de_Aproveitamento);
			System.out.println("Conceito : B");
		}else if(media_de_Aproveitamento >= 6.00f && media_de_Aproveitamento < 7.50f){
			System.out.println("A media de Aproveitamento do Aluno ("+nomeAluno+") : "+media_de_Aproveitamento);
			System.out.println("Conceito : C");
		}else if(media_de_Aproveitamento < 6.00f) {
			System.out.println("A media de Aproveitamento do Aluno ("+nomeAluno+") : "+media_de_Aproveitamento);
			System.out.println("Conceito : D");
		}
		
		
		sc.close();
	}
}
