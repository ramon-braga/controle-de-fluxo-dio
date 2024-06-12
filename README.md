# Desafio de Projeto: Controle de Fluxo

Este projeto é parte do Bootcamp de Backend com Java da DIO. O objetivo é criar um programa que solicita dois números inteiros do usuário e realiza uma contagem do primeiro número até o segundo número, desde que o segundo número seja maior que o primeiro. Se o segundo número for menor ou igual ao primeiro, o programa lançará uma exceção personalizada indicando que os parâmetros são inválidos.

## Funcionamento

1. **Leitura dos Parâmetros:**
   - O programa inicia solicitando ao usuário dois números inteiros através do console.
   - Usa a classe `Scanner` para ler os valores fornecidos pelo usuário.

2. **Validação dos Parâmetros:**
   - Os valores lidos são passados para o método `validarParametros`.
   - Este método verifica se o segundo número (`num2`) é maior que o primeiro (`num1`).
   - Se `num2` não for maior que `num1`, uma exceção `ParametrosInvalidosException` é lançada com uma mensagem de erro.

3. **Exceção Personalizada:**
   - A classe `ParametrosInvalidosException` é uma exceção personalizada que herda de `Exception`.
   - É utilizada para sinalizar que os parâmetros fornecidos pelo usuário são inválidos.

4. **Contagem:**
   - Se os parâmetros forem válidos, o método `validarParametros` chama o método `contar`.
   - O método `contar` realiza uma contagem do número 1 até o intervalo calculado (`num2 - num1`).
   - Para cada número no intervalo, o programa imprime o número no console.

5. **Tratamento de Exceção:**
   - Se a exceção `ParametrosInvalidosException` for lançada, ela é capturada no bloco `try-catch` no método `main`.
   - A mensagem de erro associada à exceção é impressa no console.

## Fluxo do Programa
1. O usuário é solicitado a inserir o primeiro parâmetro.
2. O usuário é solicitado a inserir o segundo parâmetro.
3. O programa valida os parâmetros:
   - Se o segundo parâmetro for maior que o primeiro, a contagem é iniciada.
   - Se o segundo parâmetro for menor ou igual ao primeiro, uma exceção é lançada e uma mensagem de erro é exibida.
4. A contagem é exibida no console, número por número, até atingir o intervalo calculado.

## Exemplo de Execução
- **Entrada Válida:**
  - Entrada: `5` e `10`
  - Saída: `1, 2, 3, 4, 5`
- **Entrada Inválida:**
  - Entrada: `10` e `5`
  - Saída: `O segundo parâmetro deve ser maior que o primeiro`

Esta documentação fornece uma visão geral do funcionamento do programa, detalhando os passos principais e o tratamento de exceções.
