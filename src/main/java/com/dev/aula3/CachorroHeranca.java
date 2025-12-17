package com.dev.aula3;

/**
 * @author Matheus
 * @description: Herança é um mecanismo que permite que uma classe herde propriedades e comportamentos de outra classe,
 * Observe o nosso cachorrinho, ele herda de animal, ou seja, ele herda as propriedades e comportamentos de animal
 * e também pode ter suas próprias propriedades e comportamentos
 */

public class CachorroHeranca extends AnimalHeranca {


    public CachorroHeranca(String nome, String cor, String raca) {
        super(nome, cor, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}