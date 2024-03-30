package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio15_Aposentadoria {

	public static void main(String[]Args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite o codigo do empregado: ");
		int codigoVerificacao = sc.nextInt();
		
		String codigoVerificacaoString="";
		
		switch(codigoVerificacao) {
		
		case 1: codigoVerificacaoString = "MATHEUS";
		break;
		
		case 2: codigoVerificacaoString = "JOÃO";
		break;
		
		case 3: codigoVerificacaoString = "NILTON";
		break;
		
		case 4: codigoVerificacaoString = "LUAN";
		break;
		
		case 5: codigoVerificacaoString = "THIAGO";
		break;
		
		default: System.out.println("Codigo Invalido");
		}
		System.out.println(codigoVerificacaoString);
		System.out.println();
		System.out.println();
		System.out.println("Digite a data de nascimento do "+codigoVerificacaoString+" : ");
		int dataNascimento = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Digite o ano de ingresso na empresa: ");
		int anoIngresso = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.println("Digite o ano de saida: ");
		int anoSaida = sc.nextInt();
		System.out.println();
		System.out.println();
		
		int idadeDoCliente = 2022 - dataNascimento;
		int anosPrestacao = anoSaida-anoIngresso;
		
		if(idadeDoCliente >= 65) {
			System.out.println("Requerer aposentadoria para ("+codigoVerificacaoString+") OK");
			System.out.println();
		}else if(anosPrestacao >= 30) {
			System.out.println("Requerer aposentadoria para ("+codigoVerificacaoString+") OK");
			System.out.println();
		}else if(idadeDoCliente >= 60 && anosPrestacao >= 25) {
			System.out.println("Requerer aposentadoria para ("+codigoVerificacaoString+") OK");
			System.out.println();
		}else {
			System.out.println("Não requerer aposentadoria para("+codigoVerificacaoString+")");
			System.out.println();
		}
		
		
		sc.close();
	}
}
