package home.java_iniciante;

import java.util.Scanner;
/* NESSE C�DIGO ABORDAMOS O CONCEITO DE INSTANCIAMENTO DE CLASSES
 * E UMAS DESSAS CLASSES � O SCANNER QUE � UMA CLASSE DO JAVA PARA GRAVAR
 * VALORES EM VARI�VEIS, UTILIZAMOS UM M�TODO STRING QUE � PRA DECLARAR VARI�VEIS 
 * DO TIPO ALFAB�TICA.
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
		
		
		System.out.println("Ol� " + nome + " Seja Bem Vindo");
		System.out.println("Me deixe adivinhar sua cidade natal �: " + cidade);

	}

}
