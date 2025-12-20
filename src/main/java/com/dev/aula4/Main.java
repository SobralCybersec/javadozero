package com.dev.aula4;

import com.dev.aula4.dto.ResultadoAgendamento;
import com.dev.aula4.entity.Cliente;
import com.dev.aula4.repository.AgendaRepository;
import com.dev.aula4.service.AgendarConsultaService;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00"); // Objeto / Entidade
        Cliente cliente2 = new Cliente("Maria Araujinho", "123.456.789-02"); // Objeto / Entidade

        AgendaRepository agendaRepository = new AgendaRepository(); // Banco de Dados

        AgendarConsultaService agendarConsultaService = new AgendarConsultaService(agendaRepository); // Serviço

        ResultadoAgendamento resultado = agendarConsultaService.agendarConsulta(cliente1, LocalDate.now().plusDays(20)); // Executando Agendamento
        ResultadoAgendamento resultado2 = agendarConsultaService.agendarConsulta(cliente2, LocalDate.now().plusDays(21)); // Executando Agendamento

        System.out.println(resultado.mensagem());
        System.out.println(resultado2.mensagem());
    }
}
