package com.dev.aula4.entity;

import com.dev.aula4.exceptions.HorarioJaOcupadoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private LocalDate data;
    private List<String> horariosOcupados;

    public Agenda(LocalDate data) {
        this.data = data;
        this.horariosOcupados = new ArrayList<>();
    }

    public LocalDate getData() {
        return data;
    }


    public boolean verificarConflito() {
        return !horariosOcupados.isEmpty();
    }

    public void adicionarHorario() {

        if (verificarConflito()) {
            throw new HorarioJaOcupadoException("Conflito detectado");
        } else {
            horariosOcupados.add("Novo Agendamento");
        }

    }

}
