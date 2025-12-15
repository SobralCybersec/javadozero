package com.dev.aula1;

import java.util.Random;

public class Condicionais {


    /**
     *  Condicionais são utilizadas para verificar se uma condição é verdadeira ou falsa e retonar algo
     *  Exemplo: if, else, switch, etc.
     *
     */

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int idade = aleatorio.nextInt(20);
        int x = (idade >= 18) ? 10 : 20;

        if (x == 10) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        if (x == 20) {
            System.out.println("20");
        } else if (x == 10){
            System.out.println("10");
        } else {
            System.out.println("Nada");
        }

        switch (x){
            case 30:
                System.out.println("30");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("Default");
        }
        switch (x) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
