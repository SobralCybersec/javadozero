package com.dev.aula3;

/**
 * @author Matheus
 * @description: Classe que implementa a interface
 */

public class InterfacesExemplo implements Interfaces {


    @Override   // Utilizamos Override para sobrescrever o metodo, dando assim o nosso próprio significado/função
    public void acelerar(double velocidade) {
        System.out.println("Acelerando: " + velocidade);
    }

    public static void main(String[] args) {
        InterfacesExemplo carro = new InterfacesExemplo();
        carro.acelerar(100);
    }
}
