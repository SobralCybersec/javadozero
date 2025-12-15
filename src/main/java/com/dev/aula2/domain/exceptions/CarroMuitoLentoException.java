package com.dev.aula2.domain.exceptions;

public class CarroMuitoLentoException extends RuntimeException {
    public CarroMuitoLentoException(int velocidade) {
        super("Carro muito lento: " + velocidade + " km/h");
    }
}