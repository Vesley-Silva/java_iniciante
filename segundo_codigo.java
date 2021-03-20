/*
 NESSE CÓDIGO IREI DEMONSTRAR COMO DECLARAR UMA VARIÁVEL
 E TAMBÉM COMO ESTAR EFETUANDO CONTAS DE SOMA,SUBTRAÇÃO,
 DIVISÃO E MULTIPLICAÇÃO

/**
 *
 * AUTHOR: VESLEY CESAR DA SILVA
 */
public class segundo_codigo {

    public static void main(String args[]) {
        int primeirovalor = 10;
        /*DECLARAÇÃO DE VÁRIAVEL PARA NÚMEROS INTEIROS
                                 SE USA O INT (OBS O INT TEM QUE SER MINÚSCULO)*/
        int segundovalor = 12;
        int soma;

        soma = (primeirovalor + segundovalor);
        System.out.println(soma); //MOSTRARÁ O RESULTADO EM UMA LINHA DE CÓDIGO

        double terceirovalor = 6.0;
        /* USAMOS O DOUBLE OU FLOAT PARA DECLARAR 
                                        NÚMEROS COM PONTO FLUTUANTES POR EXEMPLO 
                                        5.8 OU 3.45 A DIFERENÇA DO FLOAT PARA O DOUBLE
                                        ESTÁ NA QUANTIDADE DE CASAS DEPOIS DO PONTO 
                                        ENQUANTO O DOUBLE ACEITA VÁRIAS CASAS APÓS O PONTO 
                                        O FLOAT JÁ É UM POUCO LIMITADO(SE USA TANTO O FLOAT E DOUBLE 
                                        EM ESCRITA MINÚSCULO)*/
        double quartavalor = 4.0;
        double subtracao;

        subtracao = (terceirovalor - quartavalor);
        System.out.println(subtracao);
        /* NESSA LINHA DE CÓDIGO IRÁ MOSTRAR O RESULTADO DA SUBTRAÇÃO
                                          UTILIZANDO O DOUBLE*/


        float quintovalor = (float) 3.456;
        float sextovalor = (float) 5.67;
        float divisao;

        divisao = (sextovalor / quintovalor);
        System.out.println(divisao);
        /* NESSA LINHA DE CÓDIGO IRÁ MOSTRAR O RESULTADO DA DIVISÃO
                                        UTILIZANDO O FLOAT*/


        double multiplicacao = (soma * subtracao) * divisao;
        System.out.println(multiplicacao);
        /*NESSA LINHA DE CÓDIGO IRÁ MOSTRAR O RESULTADO DA 
                                             MULTIPLICAÇÃO QUE FIZEMOS UTILIZANDO OS TRÊS RESULTADOS 
                                              DAS TRÊS OPERAÇÕES QUE FIZEMOS NOS EXEMPLOS ACIMA */


    }
}
