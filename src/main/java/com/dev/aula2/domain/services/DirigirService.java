package com.dev.aula2.domain.services;

import com.dev.aula2.domain.entidades.Carro;
import com.dev.aula2.domain.entidades.Eu;
import com.dev.aula2.domain.interfaces.Veiculo;

public class DirigirService {

    public void dirigir(Eu eu, Carro carro) {
        if (!eu.isTemHabilitação()) {
            throw new RuntimeException("Não pode dirigir");
        }

        if (!carro.getModelo()) {
            throw new RuntimeException("Sem combustível");
        }

        System.out.println("Dirigindo...");
    }
}
