package com.dev.aula2.domain.exceptions;

public class CarroMuitoRapidoException extends RuntimeException {
    public CarroMuitoRapidoException(int velocidade) {
        super("Carro muito rápido, você foi multado! " + velocidade + "km/h Limite de Velocidade Atingido");
    }
}
