
import javax.swing.JOptionPane;

/*PRIMEIRO C�DIGO EM JAVA
 AQUI IREI DEMONSTRAR DUAS FORMAS DE EXIBIR MENSAGEM NA TELA
 USANDO OS M�TODOS (PRINTLN E JOPTION)
 ATEN��O POR LEI DE PROGRAMA��O E SUPERSTI��O E SEMPRE RECOMENDADO 
 QUE QUANDO VOC� IR� INICIAR UM NOVO APRENDIZADO EM QUALQUER LIGUAGEM DE PROGRAMA��O
 � INDICADO QUE COMECE COM UM "HELLO WORLD" OU "OL� MUNDO" PARA QUE VOC� SE TORNE UM 
 PROGRAMADOR DE SUCESSO
*/

public class primeiro_codigo {

   
    public static void main(String args[]) {
        
        System.out.println("Hello World");  /* FORMA QUE TRAZ UM RESULTADO
                                            NO CONSOLE DO NETBEANS */
        
        
        JOptionPane.showMessageDialog(null, "Hello World"); /*FORMA QUE EXIBE A MENSAGEM UTILIZANDO UMA
                                                               UTILIZANDO UMA CAIXA DE TEXTO*/
    }
}
