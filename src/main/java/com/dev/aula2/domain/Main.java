package com.dev;

import com.dev.aula2.domain.services.IrAoTrabalho;
import com.dev.aula2.domain.entity.CarroEntity;
import com.dev.aula2.domain.entity.EuEntity;


public class Main {

    public static void main(String[] args) {
        EuEntity eu = new EuEntity("João"); // Entidade / Objeto
        CarroEntity carro = new CarroEntity(120); //Entidade / Objeto
        IrAoTrabalho irAoTrabalho = new IrAoTrabalho(eu, carro); //Regra de Negócio / Nosso Objetivo

        irAoTrabalho.executar();
    }
}