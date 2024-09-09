# CalculoSoma

O `CalculoSoma` é um programa em Java que calcula a soma dos números inteiros de 1 até um valor específico, definido pela variável `INDICE`. O programa utiliza um loop para realizar a soma e exibe o resultado final.

## Descrição

Este programa define uma variável `INDICE` com o valor 12 e, em seguida, calcula a soma dos números inteiros de 1 até 11 (um a menos que o valor de `INDICE`). O resultado da soma é armazenado na variável `SOMA`, que é então exibida.

## Funcionalidades

- Calcula a soma dos números inteiros a partir de 1 até um número menor que o valor da variável `INDICE`.
- Exibe o valor final da soma.

## Como Usar

1. Compile o programa usando um compilador Java.
   ```bash
   javac CalculoSoma.java
   ```

2. Execute o programa.
   ```bash
   java CalculoSoma
   ```

3. O programa exibirá o valor final da soma, que é calculado a partir da variável `INDICE`.

## Código

O código fonte está disponível no arquivo `CalculoSoma.java`. O programa realiza a soma dos números inteiros usando um loop `while`, incrementa a variável `K` e adiciona seu valor à variável `SOMA`.

### Exemplo de Código

```java
package question3;

public class CalculoSoma {

    public static void main(String[] args) {
        // Declaração das variáveis
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        // Loop para calcular SOMA
        while (K < INDICE) {
            K = K + 1;       // Incrementa o valor de K
            SOMA = SOMA + K; // Soma o valor de K a SOMA
        }

        // Exibe o resultado final de SOMA
        System.out.println("O valor final de SOMA é: " + SOMA);
    }
}
```

## Requisitos

- Java 8 ou superior.