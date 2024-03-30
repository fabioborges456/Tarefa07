package tarefa07DeLinguagemDeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio12_UsuarioOuSenha {

	/*
	 * 12) Faça um algoritmo para ler um número que é um código de usuário. Caso
	 * este código seja
	 * diferente de um código armazenado internamente no algoritmo (igual a 1234)
	 * deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código seja
	 * correto, deve ser lido outro valor que é a senha. Se esta senha estiver
	 * incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’.
	 * Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
	 */

	public static void main(String[]Args) {
		
	Scanner sc = new Scanner (System.in);	
	
	System.out.println("Digite o codigo de Usuario Correto: ");
	int codigoCerto = sc.nextInt();
	
	if(codigoCerto == 1234) {
		System.out.println("Correto");
	}else if(codigoCerto != 1234) {
		System.out.println("Usuario Invalido !!!");
		System.out.println("Digite o codigo novamente: ");
		int novaTentativa = sc.nextInt();
		if(novaTentativa != 1234) {
			System.out.println("Usuario Invalido !!!");
			System.out.println("Digite o codigo novamente: ");
			int novaTentativa02 = sc.nextInt();
			if(novaTentativa02 != 1234) {
				System.out.println("Usuario Invalido !!!");
			}
		}
	}
	
	System.out.println("Digite a senha correta: ");
	int senhaCorreta = sc.nextInt();
	
	if(senhaCorreta == 9999) {
		System.out.println("Acesso Permitido");
	}else if(senhaCorreta != 9999) {
		System.out.println("Senha incorreta");
		System.out.println("Digite novamente sua senha: ");
		int senhaCorreta02 = sc.nextInt();
		if(senhaCorreta02 != 9999) {
			System.out.println("Senha incorreta");
			System.out.println("Digite novamente sua senha: ");
			int senhaCorreta03 = sc.nextInt();
			if(senhaCorreta03 != 9999) {
				System.out.println("Senha incorreta");
				System.out.println("Usuario Bloqueado !!!!");
			}
		}
	}
	
	
	
	sc.close();
	}
}
