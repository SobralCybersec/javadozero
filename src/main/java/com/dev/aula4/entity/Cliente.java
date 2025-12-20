package com.dev.aula4.entity;

public class Cliente {

    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void atualizarDados(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public boolean validarCPF() {
        return cpf != null && cpf.length() == 11;
    }
}
