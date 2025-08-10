# Banco Digital - Projeto Simples em Java

## Descrição

Projeto básico de banco digital desenvolvido em Java, que simula operações bancárias em contas correntes e poupança, utilizando conceitos de programação orientada a objetos (POO) como encapsulamento, herança e polimorfismo.

## Funcionalidades

- Criação de clientes com ID único.
- Criação de contas correntes e poupança para os clientes.
- Operações básicas:
  - Depósito
  - Saque
  - Transferência entre contas
- Impressão de extrato bancário personalizado para cada tipo de conta.
- Controle interno das contas e clientes cadastrados.

## Tecnologias

- Java 10 ou superior (para uso do método `Map.copyOf`)

## Como usar

1. Clone o repositório ou copie o código fonte.
2. Compile as classes.
3. Execute a classe `Main` para testar as operações bancárias simuladas.
4. Observe as operações e extratos impressos no console.

## Estrutura do projeto

- `Person` — representa o cliente do banco.
- `Account` (classe abstrata) — base para as contas bancárias.
- `CurrentAccount` — conta corrente com extrato personalizado.
- `SavingsAccount` — conta poupança com extrato personalizado.
- `Main` — classe com o método principal para testes.