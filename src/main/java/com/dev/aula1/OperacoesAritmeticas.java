package com.dev.aula1;

public class OperacoesAritmeticas {

    /**
     *  Operações aritméticas em Java são: +(soma), -(subtração), *(multiplicação), /(divisão), %(efetua a divisão e retorna o resto), ++(incrementa um valor), --(decrementa um valor)
     *  Exemplo: +, -, *, /, %, ++, --
     */

    public static void main(String[] args) {

        int meuInt = 10;
        int meuInt2 = 3;

        System.out.println("Divisão: " + (meuInt / meuInt2));
        System.out.println("Multiplicação: " + (meuInt * meuInt2));
        System.out.println("Soma: " + (meuInt + meuInt2));
        System.out.println("Subtração: " + (meuInt - meuInt2));
        System.out.println("Resto da divisão: " + (meuInt % meuInt2));
        System.out.println("Incrementa a Variável: " + (meuInt++));
        System.out.println("Decrementa a Variável: " + (meuInt--));
        System.out.println("Variável Final: " + (meuInt));

    }
}
