package com.dev.aula3;

/**
 * @author Matheus
 * @description: Encapsulamento é um conceito que permite que os dados de um objeto
 * sejam ocultados de outros objetos. Isso é feito para proteger os dados de
 * serem modificados por código externo.
 * Em resumo: Getters e Setters são importantes e ajudam na segurança dos dados
 */

public class Encapsulamento {

    private String nome;
    private int idade;
    private String cpf;

    public Encapsulamento(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
