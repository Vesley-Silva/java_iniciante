
import javax.swing.JOptionPane;

/*PRIMEIRO CÓDIGO EM JAVA
 AQUI IREI DEMONSTRAR DUAS FORMAS DE EXIBIR MENSAGEM NA TELA
 USANDO OS MÉTODOS (PRINTLN E JOPTION)
 ATENÇÃO POR LEI DE PROGRAMAÇÃO E SUPERSTIÇÃO E SEMPRE RECOMENDADO 
 QUE QUANDO VOCÊ IRÁ INICIAR UM NOVO APRENDIZADO EM QUALQUER LIGUAGEM DE PROGRAMAÇÃO
 É INDICADO QUE COMECE COM UM "HELLO WORLD" OU "OLÁ MUNDO" PARA QUE VOCÊ SE TORNE UM 
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
