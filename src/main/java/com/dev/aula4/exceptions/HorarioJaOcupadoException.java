package com.dev.aula4.exceptions;

public class HorarioJaOcupadoException extends RuntimeException {
    public HorarioJaOcupadoException(String message) {
        super("Horário já ocupado");
    }
}
