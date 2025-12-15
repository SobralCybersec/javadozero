package com.dev.aula1;

import java.util.*;

public class AulaArrays {

    /**
     *  Arrays são utilizados para armazenar vários valores em uma única variável
     *  Exemplo: int[] arrayDeNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     *  ArrayList é uma classe que permite armazenar vários valores em uma única variável, mas é mais complexo de se usar
     *
     */

    public static void main(String[] args) {
        int[] arrayDeNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arrayDeStrings = {"Sérgio", "Math"};
        boolean[] arrayDeBooleanos = {true, false, true, false};
        char[] arrayDeCaracteres = {'S', 'e', 'r', 'g', 'i', 'o'};
        double[] arrayDeDecimais = {1.1, 1.2, 1.3, 1.4, 1.5};


        ArrayList<Double> arrayListDeDecimais = new ArrayList<>();
        arrayListDeDecimais.add(1.1);
        arrayListDeDecimais.add(1.7);
        arrayListDeDecimais.add(1.8);

        ArrayList<String> arrayListDeStrings = new ArrayList<>();
        arrayListDeStrings.add("Sérgio");
        arrayListDeStrings.add("Math");
        arrayListDeStrings.add("Java");
        arrayListDeStrings.add("C#");

        ArrayList<Integer> ListaDeArrayComInteiros = new ArrayList<>();
        ListaDeArrayComInteiros.add(1);
        ListaDeArrayComInteiros.add(2);
        ListaDeArrayComInteiros.add(3);

        HashMap<Integer, String> hashMapDeDoubleEInteiro = new HashMap<>();
        hashMapDeDoubleEInteiro.put(1, "Joana");
        hashMapDeDoubleEInteiro.put(2, "Jorge");
        hashMapDeDoubleEInteiro.put(3, "Joao");

        if (hashMapDeDoubleEInteiro.containsKey(1)) {
            System.out.println("Chave encontrada");
        } else if (hashMapDeDoubleEInteiro.containsValue("Joana")) {
            System.out.println("Chave não encontrada");
        }

        System.out.println("Array: " + Arrays.toString(arrayListDeDecimais.toArray()));
        System.out.println("Array: " + Arrays.toString(arrayDeNumeros));
        System.out.println("Índice do Array: " + (arrayDeNumeros[0]));
        System.out.println("ArrayList: " + arrayListDeStrings);
        System.out.println("HashMap: " + hashMapDeDoubleEInteiro.values());
    }
}
