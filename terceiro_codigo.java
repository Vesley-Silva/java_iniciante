package home.java_iniciante;

import java.util.Scanner;
/* NESSE CÓDIGO ABORDAMOS O CONCEITO DE INSTANCIAMENTO DE CLASSES
 * E UMAS DESSAS CLASSES É O SCANNER QUE É UMA CLASSE DO JAVA PARA GRAVAR
 * VALORES EM VARIÁVEIS, UTILIZAMOS UM MÉTODO STRING QUE É PRA DECLARAR VARIÁVEIS 
 * DO TIPO ALFABÉTICA.
 */
public class terceiro_codigo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		String cidade;
		
		System.out.println("Digite o seu nome");
		nome = scanner.next();
		System.out.println("Digite a sua cidade");
		cidade = scanner.next();
		
		
		System.out.println("Olá " + nome + " Seja Bem Vindo");
		System.out.println("Me deixe adivinhar sua cidade natal é: " + cidade);

	}

}
