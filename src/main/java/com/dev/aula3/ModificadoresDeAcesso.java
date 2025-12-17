package com.dev.aula3;


/**
 * @author Matheus Sobral
 * Modificadores de acesso, modificadores de acesso são palavras-chave que definem como as propriedades e métodos de uma classe podem ser acessados e modificados. Em Java, existem quatro tipos de modificadores de acesso: public, private, protected e default (sem modificador).
 * Classe de Teste, ClasseDeTeste2, ClasseDeTeste3 = Exemplos
 */

public class ModificadoresDeAcesso {

    // Pode ser acessado apenas dentro da própria classe
    private String nomePrivado;

    // Pode ser acessado pela própria classe, por subclasses
    // e por classes do mesmo package (no nosso caso é aula3)
    protected String nomeProtected;

    // Pode ser acessado de qualquer lugar
    public String nomePublico;

    // Pode ser acessado apenas por classes do mesmo pacote
    String nomeDefault;

    public void modificadoresDeAcesso() {
        nomePrivado = "João";
        nomeProtected = "Maria";
        nomePublico = "José";
        nomeDefault = "Pedro";
    }

    class SubClasse {

        public void testarAcesso() {
            ModificadoresDeAcesso m = new ModificadoresDeAcesso();
            m.nomeProtected = "João"; // permitido
            m.nomePublico = "Carlos"; // permitido
            m.nomeDefault = "Ana";    // permitido (mesmo pacote)
            // m.nomePrivado = "X";    // ❌ não permitido
        }
    }
}


