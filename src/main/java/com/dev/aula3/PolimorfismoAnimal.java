package com.dev.aula3;

/**
 * @author Matheus
 * @description: Classe que herda de AnimalHeranca e implementa a interface PolimorfismoAnimal
 * Polimorfismo é o ato de usar um objeto de uma classe como se fosse de outra classe
 * Exemplo: Animal animal = new Cachorro();
 * animal.emitirSom();
 */
public class PolimorfismoAnimal{

    public static void main(String[] args) {
        // Vejam que eu estou criando um objeto de uma classe que herda a herança, não a herança em si
        AnimalHeranca animalHeranca = new CachorroHeranca("Rex", "azul", "dog");
        System.out.println(animalHeranca.getNome() + " " + animalHeranca.getCor() +  " " + animalHeranca.getRaca());
    }
}
