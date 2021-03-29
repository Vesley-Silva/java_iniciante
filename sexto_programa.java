package home.java_iniciante;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/* PROGRAMA AONDE FOI UTILIZADO UM RANDOM QUE É UM GERADOR 
 * DE NÚMEROS E LETRAS, AQUI FOI UTILIZADO PARA GERAR NÚMEROS INTEIROS
 * E DEPOIS ARMAZENAR EM UM ARRAYLIST, A DIFERENÇA DE ARRAYLIST PARA UM VETOR 
 * É QUE O VETOR VOCÊ TEM QUE DEIXAR ELE COM UM VALOR ALOCADO, JÁ O ARRAY É 
 * DINAMICAMENTE ALOCADO ENTÃO ELE VAI LIBERANDO ESPAÇO CONFORME VOCÊ PRECISA
 */
public class sexto_programa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random gerador = new Random();
		ArrayList array= new ArrayList();
		int s;
		/* AONDE FOI IRÁ DIGITAR QUANTOS NÚMEROS DESEJA INSERIR
		 */
		System.out.println("Digite quantos números inteiros deseja gerar");
		s = scanner.nextInt();
		/* AONDE SERÁ INCLUÍDO OS VALORES NO ARRAY. CONFORME O RANDOM VAI 
		 *  GERAR OS NÚMEROS
		 */
		for(int r=0; r<s; r++) {
			array.add(gerador.nextInt(s));
		}
		/* AONDE SERÁ EXIBIDO OS NÚMEROS POR POSIÇÕES COMEÇANDO PELA SEGUNDA POSIÇÃO
		 * LEMBRANDO QUE EM PROGRAMAÇÃO SEMPRE COMEÇA PELO O 0 ENTÃO O ZERO SERIA A PRIMEIRA 
		 * POSIÇÃO E O 1 A SEGUNDA POSIÇÃO
		 */
		for(int e=1; e<array.size(); e++) {
			System.out.println( e + " posição " + " número gerado: " + array.get(e));
		}
		
		
	}
}
