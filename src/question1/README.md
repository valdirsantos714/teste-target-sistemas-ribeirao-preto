# FibonacciChecker

O `FibonacciChecker` é um programa em Java que verifica se um número informado pelo usuário pertence à sequência de Fibonacci.

## Descrição

Este programa solicita ao usuário que informe um número e, em seguida, determina se esse número está presente na sequência de Fibonacci. A sequência de Fibonacci é uma série de números onde cada número é a soma dos dois números anteriores, começando por 0 e 1. O programa calcula a sequência até encontrar o número fornecido ou até que o número na sequência seja maior que o número informado.

## Funcionalidades

- Verifica se um número informado pertence à sequência de Fibonacci.
- Imprime uma mensagem indicando se o número está na sequência ou não.

## Como Usar

1. Compile o programa usando um compilador Java.
   ```bash
   javac FibonacciChecker.java
   ```

2. Execute o programa.
   ```bash
   java FibonacciChecker
   ```

3. Quando solicitado, informe um número para verificar.

4. O programa exibirá se o número pertence ou não à sequência de Fibonacci.

## Código

O código fonte está disponível no arquivo `FibonacciChecker.java`. O programa contém o método `isFibonacci` que realiza a verificação e o método `main` que lida com a entrada do usuário e exibe o resultado.

### Exemplo de Código

```java
package question1;

import java.util.Scanner;

public class FibonacciChecker {

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci:");
        int numero = scanner.nextInt();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true; // Os primeiros números da sequência são 0 e 1
        }

        int prev = 0;
        int current = 1;
        int next = prev + current;

        // Calcula a sequência até o número ser maior ou igual ao informado
        while (next <= numero) {
            if (next == numero) {
                return true;
            }
            prev = current;
            current = next;
            next = prev + current;
        }

        return false;
    }
}
```

## Requisitos

- Java 8 ou superior.