package com.dev.aula2.application;



import com.dev.aula2.domain.entity.EuEntity;
import com.dev.aula2.domain.port.VeiculoInterface;

public class IrAoTrabalho {

    private final EuEntity eu;
    private final VeiculoInterface veiculo;

    public IrAoTrabalho(EuEntity eu, VeiculoInterface veiculo) {
        this.eu = eu;
        this.veiculo = veiculo;
    }

    public void executar() {
        System.out.println(eu.nome() + " começou a dirigir");
        veiculo.dirigir();
        System.out.println("Chegou ao trabalho");
    }
}
