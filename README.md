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

## 🚀 Como Executar

```bash
# Compilar o projeto
mvn compile

# Executar uma classe específica
mvn exec:java -Dexec.mainClass="com.dev.aula1.NomeDaClasse"
```

## 📝 Notas

_Próxima Aula: Aprofundamento OOP_

## 🎯 Próximas Aulas

- [X] _Fundamentos e Conceitos Básicos da Linguagem Java_
- [X] _Básico de Programação Orientada a Objetos_
- [ ] _Aprofundar POO_
- [ ] _UML (Classes e Sequência – aplicado a POO)_
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