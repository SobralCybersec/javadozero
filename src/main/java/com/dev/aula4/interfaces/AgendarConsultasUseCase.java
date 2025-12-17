package com.dev.aula4.interfaces;

import com.dev.aula4.dto.ResultadoAgendamento;
import com.dev.aula4.entity.Cliente;

import java.time.LocalDate;

public interface AgendarConsultasUseCase {
    ResultadoAgendamento agendarConsulta(Cliente cliente, LocalDate data);
}
