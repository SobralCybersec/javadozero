package com.dev.aula1;

import java.nio.charset.StandardCharsets;
import java.text.Format;
import java.util.Arrays;
import java.util.Formattable;
import java.util.logging.Formatter;

public class StringsEMetodos {

    /**
     *  Strings são sequência de caracteres que são armazenadas em variáveis e métodos são funções associadas à classe que permitem sua manipulação.
     *  Exemplo: String nome = "Sérgio";
     *  Metodo Exemplo: nome.length(); - Retorna o tamanho da string
     *
     */

    public static void main(String[] args){

        String nome = "Sérgio";
        byte[] textoParaBytes = nome.getBytes();
        String bytesParaTexto = new String(textoParaBytes, StandardCharsets.UTF_8);

        System.out.println(nome.toUpperCase());

        System.out.println(nome.length());  // Retorna o tamanho da string
        System.out.println(nome.toUpperCase()); // Retorna a String em UpperCase
        System.out.println(nome.toLowerCase()); // Retorna a String em LowerCase
        System.out.println(Arrays.toString(textoParaBytes)); // Retorna a String em Bytes
        System.out.println(bytesParaTexto); // Retorna os Bytes em String
    }
}
