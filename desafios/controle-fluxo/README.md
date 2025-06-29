# Desafio: Controle de Fluxo

Neste desafio, foi criado um algoritmo em Java que recebe dois números inteiros como entrada e realiza um controle de fluxo com base nesses valores.

## Descrição

- O programa solicita ao usuário dois valores inteiros via `Scanner`: um valor inicial e um valor final.
- Se o valor inicial for **menor que o valor final**, o algoritmo:
  - Calcula a diferença entre os dois números;
  - Realiza um loop (`for`) com base nessa diferença, imprimindo uma mensagem sequencial para cada número.
- Se o valor inicial for **maior que o valor final**, é lançada uma **exceção personalizada** chamada `ParametrosInvalidosException`, com a seguinte mensagem:

"Segundo parâmetro deve ser maior que o primeiro."


## Exemplo de execução

**Entrada:**
Digite o primeiro número: 12
Digite o segundo número: 30

**Saída:**
Imprimindo número 1
Imprimindo número 2
...
Imprimindo número 18


## Funcionalidades utilizadas

- 📥 `Scanner` para entrada de dados;
- ✅ Método para validação dos parâmetros;
- ⚠️ Classe de exceção customizada (`ParametrosInvalidosException`);
- 🔄 Estrutura de repetição `for`;
- 🧪 Blocos `try`, `catch` e `finally` para tratamento de exceções.