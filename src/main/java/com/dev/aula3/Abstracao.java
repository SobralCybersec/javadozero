package com.dev.aula3;

/**
 * @author Matheus
 * @description: Classe abstrata define o que algo É e o que DEVE fazer,
 * mas não diz COMO fazer.
 */

public abstract class Abstracao {

    // Comportamento comum
    public void ligar() {
        System.out.println("Ligado");
    }

    // Regra obrigatória (cada veículo faz do seu jeito)
    public abstract void acelerar();
}