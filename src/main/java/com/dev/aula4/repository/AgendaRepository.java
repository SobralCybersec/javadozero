package com.dev.aula4.repository;

import com.dev.aula4.entity.Agenda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AgendaRepository {

    private final List<Agenda> agendas = new ArrayList<>();

    public Optional<Agenda> buscarPorDia(LocalDate dia) {
        return agendas.stream().filter(agenda -> agenda.getData().equals(dia)).findFirst();
    }

    public Agenda buscarOuCriar(LocalDate dia) {
        return buscarPorDia(dia).orElseGet(() -> {Agenda novaAgenda = new Agenda(dia);agendas.add(novaAgenda); return novaAgenda;});
    }

    public void salvar(Agenda agenda) {
        System.out.println("Agenda salva com sucesso: " + agenda.getData());
    }

    public void remover(Agenda agenda) {
        agendas.remove(agenda);
    }
}

