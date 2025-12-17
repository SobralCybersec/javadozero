package com.dev.aula3;

/**
 * @author Matheus
 * @description Encadeamento pense como uma ação em sequência, com efeito dominó que você retorna o próprio objeto
 * Isso é útil quando você deseja reutilizar código e evitar repetição de código, ou quando você deseja realizar várias operações em sequência.
 * Exemplo: Um carro que pode ser ligado, passar a marcha, passar a marcha, passar a marcha, passar a marcha, passar a marcha.
 */

public class EncadeamentoDeMetodos {

    private int marcha = 0;

    public EncadeamentoDeMetodos ligarCarro() {
        System.out.println("[ \uD83D\uDE97 ] \uD83D\uDCA1  (carro ligando)");
        return this;
    }

    public EncadeamentoDeMetodos passarMarcha() {

        String velocidade = "\uD83D\uDCA8".repeat(marcha);

        marcha++;
        switch (marcha) {
            case 1, 2, 3, 4, 5:
                System.out.println("Passando mais uma marcha! [ 🚗 " + velocidade + " ]");
                break;
            default:
                System.out.println("Marcha inválida");
        }
        return this;
    }

    public static void main(String[] args) {
        // Você pode adicionar mais marchas

        new EncadeamentoDeMetodos()
                .ligarCarro()
                .passarMarcha()
                .passarMarcha()
                .passarMarcha()
                .passarMarcha()
                .passarMarcha();
    }
}