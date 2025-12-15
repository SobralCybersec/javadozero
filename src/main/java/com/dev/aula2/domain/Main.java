package com.dev.aula2.domain;

import com.dev.aula2.domain.services.IrAoTrabalho;
import com.dev.aula2.domain.entity.CarroEntity;
import com.dev.aula2.domain.entity.EuEntity;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a velocidade máxima do carro: ");
        int velocidade = scanner.nextInt();

        EuEntity eu = new EuEntity(nome); // Entidade / Objeto
        CarroEntity carro = new CarroEntity(velocidade); //Entidade / Objeto
        IrAoTrabalho irAoTrabalho = new IrAoTrabalho(eu, carro); //Regra de Negócio / Nosso Objetivo

        irAoTrabalho.executar();

        scanner.close();
    }
}