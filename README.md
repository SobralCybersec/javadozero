# Java do Zero ao Desenvolvedor de Software - Estudos

### Este repositório contém os estudos e exercícios práticos de Java vindo do 0 até o Máximo, organizados por aulas, tomei essa iniciativa por conta do conteúdo do Renato Augusto

## 📚 MindMap Aula - 1:

<img src="https://i.imgur.com/oOn2P0s.png" width="800">

## Aula 1 - Fundamentos de Java

Conceitos básicos da linguagem Java:

- **Variáveis** (`Variaveis.java`)
  - Declaração e armazenamento de valores com tipos específicos

- **Tipos Primitivos** (`TiposPrimitivos.java`)
  - Tipos básicos: byte, short, int, long, float, double, char, boolean

- **Tipos Não Primitivos** (`TiposNaoPrimitivos.java`)
  - Tipos de referência: String, List, Map, HashMap e ArrayList

- **Type Casting** (`TypeCasting.java`)
  - Conversão entre tipos de dados (implícita e explícita)

- **Operações Aritméticas** (`OperacoesAritmeticas.java`)
  - Operadores: +, -, *, /, %, ++, --

- **Strings e Métodos** (`StringsEMetodos.java`)
  - Manipulação de strings: length(), toUpperCase(), toLowerCase(), getBytes()

- **Condicionais** (`Condicionais.java`)
  - Estruturas de decisão: if, else, else if, switch, operador ternário

- **Loops** (`Loops.java`)
  - Estruturas de repetição: for, while, do while

- **Arrays** (`AulaArrays.java`)
  - Arrays primitivos, ArrayList e HashMap para armazenar múltiplos valores

- **Escopo** (`Escopo.java`)
  - Área de atuação de variáveis: escopo global e local

## 📚 MindMap Aula - 2:

<img src="https://i.imgur.com/77mMQRz.png" width="800">

## Aula 2 - Programação Orientada a Objetos

Conceitos de POO e arquitetura:

- **Entidades** (`entity/`)
  - `CarroEntity.java` - Implementa VeiculoInterface com validação de velocidade
  - `EuEntity.java` - Record para representar pessoa

- **Exceções** (`exceptions/`)
  - `CarroMuitoLentoException.java` - Exceção para velocidade abaixo de 40 km/h
  - `CarroMuitoRapidoException.java` - Exceção para velocidade acima de 60 km/h

- **Interfaces** (`port/`)
  - `VeiculoInterface.java` - Contrato para veículos com método dirigir()

- **Serviços** (`services/`)
  - `IrAoTrabalho.java` - Orquestra a lógica de negócio usando entidades e interfaces

- **Main** (`Main.java`)
  - Aplicação que simula uma pessoa dirigindo ao trabalho com validação de velocidade

## 📚 MindMap Aula - 3(Extensa):

<img src="https://i.imgur.com/9qLiFZr.png" width="800">

##

<img src="https://i.imgur.com/ep9SNas.png" width="800">

##

<img src="https://i.imgur.com/UH1GTYQ.png" width="800">

##

<img src="https://i.imgur.com/Cf6NpLE.png" width="800">

##

<img src="https://i.imgur.com/6hrSrbj.png" width="800">

##

<img src="https://i.imgur.com/5Znsnc1.png" width="800">

## Aula 3 - Aprofundamento em POO

Conceitos avançados de Programação Orientada a Objetos:

- **Herança** (`AnimalHeranca.java`, `CachorroHeranca.java`)
  - Mecanismo que permite herdar propriedades e comportamentos de outra classe

- **Polimorfismo** (`PolimorfismoAnimal.java`)
  - Usar um objeto de uma classe como se fosse de outra classe

- **Encapsulamento** (`Encapsulamento.java`)
  - Ocultar dados de um objeto usando getters e setters para proteção

- **Abstração** (`Abstracao.java`)
  - Classe abstrata define o que algo É e o que DEVE fazer, mas não COMO fazer

- **Interfaces** (`Interfaces.java`, `InterfacesExemplo.java`)
  - Contrato que define métodos que uma classe deve implementar

- **Enums** (`Enums.java`, `TesteEnums.java`)
  - Tipo especial que representa conjunto fixo de constantes

- **Records** (`RecordsRecord.java`)
  - Classe especial para criar tipos de dados imutáveis

- **Keywords** (`Keywords.java`)
  - Palavras-chave: static, final e seus comportamentos

- **Modificadores de Acesso** (`ModificadoresDeAcesso.java`)
  - Controle de acesso: public, private, protected e default

- **Classes Aninhadas** (`ClassesAninhadas.java`)
  - Classes definidas dentro de outras classes

- **Encadeamento de Métodos** (`EncadeamentoDeMetodos.java`)
  - Retornar o próprio objeto para realizar operações em sequência


## 📚 MindMap Aula - 4:

<img src="https://i.imgur.com/GQA5FP2.png" width="800">

<img src="https://i.imgur.com/vyTzxYK.jpeg" width="800">

<img src="https://i.imgur.com/FAvaKAN.jpeg" width="800">

## Aula 4 - UML (Classes e Sequência – aplicado a POO)

Desafio: Sistema de Sincronização de Agendas para Saúde

- **DTO** (`dto/`)
  - `ResultadoAgendamento.java` - Record com resultado da operação (sucesso, mensagem)

- **Entidades** (`entity/`)
  - `Cliente.java` - Dados pessoais do cliente (nome, cpf) com validação
  - `Agenda.java` - Controle de horários ocupados e verificação de conflitos

- **Exceções** (`exceptions/`)
  - `HorarioJaOcupadoException.java` - RuntimeException para horários já ocupados

- **Interfaces** (`interfaces/`)
  - `AgendarConsultasUseCase.java` - Contrato para agendamento de consultas

- **Repositório** (`repository/`)
  - `AgendaRepository.java` - Persistência de agendas com busca e criação

- **Serviço** (`service/`)
  - `AgendarConsultaService.java` - Implementa sincronização com pattern Result e prevenção de conflitos

- **Main** (`Main.java`)
  - Demonstração do sistema de agendamento


## 🚀 Como Executar

```bash
# Compilar o projeto
mvn compile

# Executar uma classe específica
mvn exec:java -Dexec.mainClass="com.dev.aula1.NomeDaClasse"
```

## 📝 Notas

_Próxima Aula: Exceptions, Anotações, Injeção de Dependência, Módulos, Optionals, Operações I/O, Operações de Arquivos_

## 🎯 Próximas Aulas

- [X] _Fundamentos e Conceitos Básicos da Linguagem Java_
- [X] _Básico de Programação Orientada a Objetos_
- [X] _Aprofundar POO_
- [X] _UML (Classes e Sequência – aplicado a POO)_
- [ ] _Exceptions, Anotações, Injeção de Dependência, Módulos, Optionals, Operações I/O, Operações de Arquivos_
- [ ] _Collections, Memória, Threading, Concorrência_
- [ ] _Fundamentos de Banco de Dados (SQL + Modelagem)_
- [ ] _Criptografia, Network, Regex_
- [ ] _Programação Funcional_
- [ ] _Ferramentas de Build_
- [ ] _(Introdução)Spring Boot, Web Frameworks, Play Framework, Quarkus_
- [ ] _ORM (Object-Relational Mapping, Database Acess)_
- [ ] _Documentação_
- [ ] _Ferramentas de Logging_
- [ ] _Debug e Ferramentas de Teste(Mockito, JUnit, JMeter)_
- [ ] _Arquitetura de Software_
- [ ] _UML / C4 Model (Componentes e Containers)_
- [ ] _Design Patterns_
- [ ] _Aprofundamento em Spring Boot_