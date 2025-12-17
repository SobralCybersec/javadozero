package com.dev.aula4.service;

import com.dev.aula4.dto.ResultadoAgendamento;
import com.dev.aula4.entity.Agenda;
import com.dev.aula4.entity.Cliente;
import com.dev.aula4.interfaces.AgendarConsultasUseCase;
import com.dev.aula4.repository.AgendaRepository;

import java.time.LocalDate;

public class AgendarConsultaService implements AgendarConsultasUseCase {

    private final AgendaRepository agendaRepository;

    public AgendarConsultaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }


    @Override
    public ResultadoAgendamento agendarConsulta(Cliente cliente, LocalDate data) {

        Agenda agenda = agendaRepository.buscarOuCriar(data);


        agenda.adicionarHorario();

        agendaRepository.salvar(agenda);

        return new ResultadoAgendamento(true, "Consulta agendada com sucesso");
    }
}
