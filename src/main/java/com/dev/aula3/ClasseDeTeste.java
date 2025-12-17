package com.dev.aula3;

public class ClasseDeTeste {
    ModificadoresDeAcesso modificadoresDeAcesso = new ModificadoresDeAcesso();

    public ModificadoresDeAcesso getModificadoresDeAcesso() {
        return modificadoresDeAcesso;
    }


    public void testarAcesso() {
        ModificadoresDeAcesso m = new ModificadoresDeAcesso();
        m.nomeProtected = "João"; // permitido
        m.nomePublico = "Carlos"; // permitido
        m.nomeDefault = "Ana";    // permitido (mesmo pacote)
        // m.nomePrivado = "X";    // ❌ não permitido
    }
}
