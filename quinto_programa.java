package home.java_iniciante;

import java.util.Scanner;

public class quinto_programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Defina o tamanho do vetor");
		int tmvetor = scanner.nextInt();
		int[] vetor = new int[tmvetor];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número");
			vetor[i] = scanner.nextInt();
		}
		for (int b = 0; b < vetor.length; b++) {
			System.out.println("vetor na " + (b + 1) + " posição: " + vetor[b]);
		}
		int cont1, cont2, aux;
		for (cont1 = 0; cont1 < vetor.length; cont1++) {
			for (cont2 = 0; cont2 < (vetor.length - 1); cont2++) {
				if (vetor[cont2] > vetor[cont2 + 1]) {
					aux = vetor[cont2];
					vetor[cont2] = vetor[cont2 + 1];
					vetor[cont2 + 1] = aux;
				}
			}
		}
		for(int e=0; e<vetor.length; e++ ) {
			System.out.println("Número ordenado " + (e+1) + " º posição " +": " + vetor[e] );
		}
	}
}
