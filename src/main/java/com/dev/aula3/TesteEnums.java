package com.dev.aula3;

/**
 * @author Matheus
 * @description: Teste de Enums
 */
public class TesteEnums {

    public static void main(String[] args) {
        // Nosso loop para verificar cada valor de Enum e switch para que cada caso retorne um print do seu valor
        for (Enums tipo : Enums.values()) {
            switch (tipo) {
                case CASA -> System.out.println("Casa Preço: " + tipo.getValor());
                case APARTAMENTO -> System.out.println("Apartamento Preço: " + tipo.getValor());
                case CHACARA -> System.out.println("Chácara Preço: " + tipo.getValor());
            }
        }

    }
}