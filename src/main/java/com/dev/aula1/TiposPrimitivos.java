package com.dev.aula1;

public class TiposPrimitivos {


    /**
     *  Tipos primitivos em Java são: byte, short, int, long, float, double, char, boolean e servem para armazenar dados diretamente na memória
     *  Exemplo: bytes, são valores que vão de -128 até 127
     *
     */


    public static void main(String[] args) {

        byte meuByte = 127; // Valores de -128 até 127

        int meuInt = 2147483647; // Valores de -2.147.483.648 até 2.147.483.647

        long meuLong = 9223372036854775807L; // Valores de -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807

        float meuFloat = 3.14f; // Valores de 1.4E-45 até 3.4028235E38

        double meuDouble = 3.141592653589793; // Valores de 4.9E-324 até 1.7976931348623157E308

        char meuChar = 'A'; // Utilizado para armazenar caracteres

        boolean meuBoolean = true; // Utilizado para armazenar condições ( se são verdadeiras ou falsas ) = true or false

        System.out.println("Valores dos tipos primitivos:" + meuBoolean);
    }
}
