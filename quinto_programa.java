package home.java_iniciante;
/* PROGRAMA QUE FAZ A INSER��O DE N�MEROS EM UM VETOR
 * E DEPOIS ORDENA ESSES N�MEROS DE FORMA CRESCENTE
 * AUTHOR: VESLEY CESAR DA SILVA
 */

import java.util.Scanner;

public class quinto_programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Defina o tamanho do vetor");
		int tmvetor = scanner.nextInt();
		int[] vetor = new int[tmvetor];
        /* SCRIPT QUE FAZ A INSER��O DOS N�MEROS NO VETOR UTILIZANDO UM FOR SIMPLES
         */
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um n�mero");
			vetor[i] = scanner.nextInt();
		}
		/* SCRIPT QUE MOSTRA A POSI��O DO VETOR EM QUE O N�MERO FOI INSERIDO
		 */
		for (int b = 0; b < vetor.length; b++) {
			System.out.println("vetor na " + (b + 1) + " posi��o: " + vetor[b]);
		}
		/* SCRIPT QUE FAZ A ORDENA��O DOS N�MEROS DENTRO DO VETOR EM 
		 * ORDEM CRESCENTE UTILIZANDO UM LA�O DE REPETI��O DENTRO DE OUTRO 
		 * LA�O
		 */
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
		/* SCRIPT QUE MOSTRA OS VALORES DOS VETORES DEPOIS DE SER ORDENADO
		 */
		for(int e=0; e<vetor.length; e++ ) {
			System.out.println("N�mero ordenado " + (e+1) + " � posi��o " +": " + vetor[e] );
		}
	}
}
