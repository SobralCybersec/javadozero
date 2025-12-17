package com.dev.aula3;

/**
 * @author Matheus
 * @description: Record é uma classe especial que permite criar
 * tipos de dados imutáveis(só da pra mudar na criação) com um conjunto restrito de campos.
 * Significa que eu posso passar algo no record como uma variável e não podem ser alterados depois, deixando mais seguro
 */

// Se eu quiser passar algo no record como uma variável, eu posso
public record RecordsRecord(String nome, int idade) {

    public static void main(String[] args) {
        RecordsRecord recordsRecord = new RecordsRecord("João", 10);
        System.out.println("Nome: " + recordsRecord.nome + " Idade: " + recordsRecord.idade);
        // recordsRecord.nome = "Maria";  // Impossível de Editar, somente criando uma nova instância do nosso record
        RecordsRecord recordsRecord2 = new RecordsRecord("Maria", 20);
        System.out.println("Nome: " + recordsRecord2.nome + " Idade: " + recordsRecord2.idade);
    }
}
