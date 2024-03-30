package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio03_2ValoresFazerSoma {

	/*
	 * 3) Ler 3 valores (considere que não serão informados valores iguais) e
	 * escrever a soma dos 2
	 * 
	 * maiores.
	 */

	public static void main(String[]Args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor 1 :");
		int valor01 = sc.nextInt();
		System.out.println("Digite o valor 2 :");
		int valor02 = sc.nextInt();
		System.out.println("Digite o valor 3 :");
		int valor03 = sc.nextInt();
		
		if(valor01 > valor02 && valor01 > valor03 && valor02 > valor03) {
			System.out.println(valor01+" , "+valor02);
			float resultado01 = valor01+valor02;
			System.out.println("A soma dos 2 maiores numero digitado foi: "+resultado01);
		}else if(valor02 > valor01 && valor02 > valor03 && valor03 > valor01) {
			System.out.println(valor02+" , "+valor03);
			float resultado02 = valor02+valor03;
			System.out.println("A soma dos 2 maiores numero digitado foi: "+resultado02);
		}else if(valor03 > valor01 && valor03 > valor02 && valor02 > valor01) {
			System.out.println(valor03+" , "+valor02);
			float resultado03 = valor03+valor02;
			System.out.println("A soma dos 2 maiores numero digitado foi: "+resultado03);
		}else if(valor02 > valor01 && valor02 > valor03 && valor01 > valor03) {
			System.out.println(valor02+" , "+valor01);
			float resultado04 = valor02+valor01;
			System.out.println("A soma dos 2 maiores numero digitado foi: "+resultado04);
		}
		
	
		sc.close();
	}
}
	

