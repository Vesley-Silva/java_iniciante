package home.java_iniciante;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/* PROGRAMA AONDE FOI UTILIZADO UM RANDOM QUE � UM GERADOR 
 * DE N�MEROS E LETRAS, AQUI FOI UTILIZADO PARA GERAR N�MEROS INTEIROS
 * E DEPOIS ARMAZENAR EM UM ARRAYLIST, A DIFEREN�A DE ARRAYLIST PARA UM VETOR 
 * � QUE O VETOR VOC� TEM QUE DEIXAR ELE COM UM VALOR ALOCADO, J� O ARRAY � 
 * DINAMICAMENTE ALOCADO ENT�O ELE VAI LIBERANDO ESPA�O CONFORME VOC� PRECISA
 */
public class sexto_programa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random gerador = new Random();
		ArrayList array= new ArrayList();
		int s;
		/* AONDE FOI IR� DIGITAR QUANTOS N�MEROS DESEJA INSERIR
		 */
		System.out.println("Digite quantos n�meros inteiros deseja gerar");
		s = scanner.nextInt();
		/* AONDE SER� INCLU�DO OS VALORES NO ARRAY. CONFORME O RANDOM VAI 
		 *  GERAR OS N�MEROS
		 */
		for(int r=0; r<s; r++) {
			array.add(gerador.nextInt(s));
		}
		/* AONDE SER� EXIBIDO OS N�MEROS POR POSI��ES COME�ANDO PELA SEGUNDA POSI��O
		 * LEMBRANDO QUE EM PROGRAMA��O SEMPRE COME�A PELO O 0 ENT�O O ZERO SERIA A PRIMEIRA 
		 * POSI��O E O 1 A SEGUNDA POSI��O
		 */
		for(int e=1; e<array.size(); e++) {
			System.out.println( e + " posi��o " + " n�mero gerado: " + array.get(e));
		}
		
		
	}
}
