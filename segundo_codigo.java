/*
 NESSE C�DIGO IREI DEMONSTRAR COMO DECLARAR UMA VARI�VEL
 E TAMB�M COMO ESTAR EFETUANDO CONTAS DE SOMA,SUBTRA��O,
 DIVIS�O E MULTIPLICA��O

/**
 *
 * AUTHOR: VESLEY CESAR DA SILVA
 */
public class segundo_codigo {

    public static void main(String args[]) {
        int primeirovalor = 10;
        /*DECLARA��O DE V�RIAVEL PARA N�MEROS INTEIROS
                                 SE USA O INT (OBS O INT TEM QUE SER MIN�SCULO)*/
        int segundovalor = 12;
        int soma;

        soma = (primeirovalor + segundovalor);
        System.out.println(soma); //MOSTRAR� O RESULTADO EM UMA LINHA DE C�DIGO

        double terceirovalor = 6.0;
        /* USAMOS O DOUBLE OU FLOAT PARA DECLARAR 
                                        N�MEROS COM PONTO FLUTUANTES POR EXEMPLO 
                                        5.8 OU 3.45 A DIFEREN�A DO FLOAT PARA O DOUBLE
                                        EST� NA QUANTIDADE DE CASAS DEPOIS DO PONTO 
                                        ENQUANTO O DOUBLE ACEITA V�RIAS CASAS AP�S O PONTO 
                                        O FLOAT J� � UM POUCO LIMITADO(SE USA TANTO O FLOAT E DOUBLE 
                                        EM ESCRITA MIN�SCULO)*/
        double quartavalor = 4.0;
        double subtracao;

        subtracao = (terceirovalor - quartavalor);
        System.out.println(subtracao);
        /* NESSA LINHA DE C�DIGO IR� MOSTRAR O RESULTADO DA SUBTRA��O
                                          UTILIZANDO O DOUBLE*/


        float quintovalor = (float) 3.456;
        float sextovalor = (float) 5.67;
        float divisao;

        divisao = (sextovalor / quintovalor);
        System.out.println(divisao);
        /* NESSA LINHA DE C�DIGO IR� MOSTRAR O RESULTADO DA DIVIS�O
                                        UTILIZANDO O FLOAT*/


        double multiplicacao = (soma * subtracao) * divisao;
        System.out.println(multiplicacao);
        /*NESSA LINHA DE C�DIGO IR� MOSTRAR O RESULTADO DA 
                                             MULTIPLICA��O QUE FIZEMOS UTILIZANDO OS TR�S RESULTADOS 
                                              DAS TR�S OPERA��ES QUE FIZEMOS NOS EXEMPLOS ACIMA */


    }
}
