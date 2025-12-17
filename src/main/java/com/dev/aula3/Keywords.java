package com.dev.aula3;

/**
 * @author Matheus
 * Keywords em java são palavras-chaves que definem a sintaxe e o comportamento do código em Java. Elas são usadas para definir classes, métodos, variáveis, etc.
 */
public class Keywords {

    // A Keyword static é usada para declarar um membro estático, ou seja, um membro que pertence

    // static cria uma única cópia do membro na classe

    static String nome = "João";

    // A keyword final é usada para declarar uma constante, ou seja, um valor que não pode ser alterado

    final static String sobrenome = "Silva";


    // O main é static pois a JVM precisa executá-lo
    // sem criar uma instância da classe.
    // Como métodos static pertencem à classe,
    // o main pode ser chamado diretamente pela JVM
    // no momento em que o programa inicia.
    public static void main(String[] args) {
        System.out.println(nome);
        System.out.println(nome);
        // Todos objetos compartilham o mesmo valor da variável estática
        // ou seja, se alterar o valor de uma variável estática, todos os objetos que acessam essa variável
        // vão ter o mesmo valor
        nome = "Maria";
        System.out.println(nome);
        System.out.println(nome);

        // Eu estou impossibilitado de alterar o valor do sobrenome (Cannot assign a value to final variable 'sobrenome')
        // sobrenome = "Santos";
    }
}
