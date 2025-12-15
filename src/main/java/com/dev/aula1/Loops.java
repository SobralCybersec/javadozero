package com.dev.aula1;

public class Loops {

    /**
     *  Loops são auto-explicativos: for, while e do while
     *
     */

    public static void main(String[] args) {

        /**
         *  Como funciona um Loop:
         * 1. Inicialização: inicializa a variável de controle do loop (int i = 0;)
         * 2. Condição: verifica se o loop deve continuar sendo executado (i < 10;)
         * 3. Execução: executa o código dentro do bloco do loop
         * 4. Incremento: atualiza o valor da variável de controle (i++)
         *
         */

        int idade = 18;
        int exercicio = 20;


        while (exercicio > idade){
            System.out.println("Idade" + idade);
            idade++;
        }



    }
}
