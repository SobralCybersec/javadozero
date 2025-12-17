package com.dev;

import com.dev.aula3.ModificadoresDeAcesso;

public class ClasseDeTeste2 {
    public void testarAcesso() {
        ModificadoresDeAcesso m = new ModificadoresDeAcesso();
        // m.nomeProtected = "João"; // não permitido
        m.nomePublico = "Carlos"; // permitido
        // m.nomeDefault = "Ana";    // não permitido (não está no mesmo pacote)
        // m.nomePrivado = "X";    // ❌ não permitido
    }

}
