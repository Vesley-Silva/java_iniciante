package home.java_iniciante;

import java.util.Scanner;

public class quarto_codigo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome = null;
		String cidade = null;
		String cep = null;
		int idade = 0;

		System.out.println(
				" Precisamos que faça um cadastro para continuar! " + " Digite 1 para continuar e 0 para cancelar ");
		int d = scanner.nextInt();

		if (d == 0) {
			System.out.println(" Você cancelou a operação! ");
		}

		if (d == 1) {
			System.out.println("Digite o seu nome");
			nome = scanner.next();
			System.out.println("Digite a sua cidade");
			cidade = scanner.next();
			System.out.println("Digite a sua idade");
			idade = scanner.nextInt();
			System.out.println("Digite o seu CEP");
			cep = scanner.next();
			System.out.println("Seja Bem Vindo " + nome);
			System.out.println("Você mora na cidade de: " + cidade);
			System.out.println("Sua idade é de: " + idade + " anos ");
			System.out.println("O Cep da sua cidade é: " + cep);
		}
		

	}

}
