package com.dev.aula2.domain.entity;


import com.dev.aula2.domain.exceptions.CarroMuitoLentoException;
import com.dev.aula2.domain.exceptions.CarroMuitoRapidoException;
import com.dev.aula2.domain.port.VeiculoInterface;

public class Carro implements VeiculoInterface {

    private final int velocidadeMaxima;

    public Carro(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public void dirigir() {
        if (velocidadeMaxima < 40) {
            throw new CarroMuitoLentoException(velocidadeMaxima);
        } else if (velocidadeMaxima > 60){
            throw new CarroMuitoRapidoException(velocidadeMaxima);
        }
        System.out.println("Carro dirigindo a " + velocidadeMaxima + " km/h");
    }
}