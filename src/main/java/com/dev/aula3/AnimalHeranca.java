package com.dev.aula3;

public class AnimalHeranca  {

    private  String nome;
    private  String cor;
    private  String raca;

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;
    }


    public AnimalHeranca(String nome, String cor, String raca) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som");
    }


    public void setRaca(String raca) {
        this.raca = raca;
    }
}
