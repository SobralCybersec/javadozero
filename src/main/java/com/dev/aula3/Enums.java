package com.dev.aula3;

/**
 * @author Matheus
 * @description: Enum é um tipo especial de classe que representa
 * um conjunto fixo de constantes com significado e comportamento.
 */
public enum Enums {

    CASA(1_000_000),
    APARTAMENTO(1_000),
    CHACARA(10_000);

    private final int valor;

    // Construtor do enum
    Enums(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
