package com.dev.aula2.domain;

import com.dev.aula3.ModificadoresDeAcesso;

public class ClasseDeTeste3 {

    public void testarAcesso() {
        ModificadoresDeAcesso m = new ModificadoresDeAcesso();
        m.nomePublico = "Carlos"; // permitido
        // m.nomePrivado = "X";    // ❌ não permitido
    }
}
