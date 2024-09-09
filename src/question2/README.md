# LetraAVerificador

O `LetraAVerificador` é um programa em Java que verifica a existência e conta a quantidade de vezes que a letra 'a' (em maiúscula ou minúscula) aparece em uma string fornecida pelo usuário.

## Descrição

Este programa solicita ao usuário que informe uma string e, em seguida, verifica quantas vezes a letra 'a' ou 'A' aparece nessa string. Ele conta todas as ocorrências e fornece uma mensagem indicando a quantidade encontrada ou informa que a letra não foi encontrada.

## Funcionalidades

- Verifica e conta as ocorrências da letra 'a' (tanto maiúscula quanto minúscula) em uma string fornecida.
- Exibe a quantidade de vezes que a letra aparece ou uma mensagem indicando que a letra não foi encontrada.

## Como Usar

1. Compile o programa usando um compilador Java.
   ```bash
   javac LetraAVerificador.java
   ```

2. Execute o programa.
   ```bash
   java LetraAVerificador
   ```

3. Quando solicitado, informe uma string para verificar.

4. O programa exibirá a quantidade de vezes que a letra 'a' aparece na string ou informará que a letra não foi encontrada.

## Código

O código fonte está disponível no arquivo `LetraAVerificador.java`. O programa contém o método `verificarLetraA` que realiza a verificação e contagem, e o método `main` que lida com a entrada do usuário e exibe o resultado.

### Exemplo de Código

```java
package question2;

import java.util.Scanner;

public class LetraAVerificador {

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita uma string do usuário
        System.out.println("Informe uma string para verificar a existência da letra 'a':");
        String input = scanner.nextLine();

        verificarLetraA(input);

        scanner.close();
    }

    // Método para verificar a existência e contar a letra 'a' (maiúscula ou minúscula)
    public static void verificarLetraA(String input) {
        int count = 0;

        // Converte a string para um array de caracteres
        char[] caracteres = input.toCharArray();

        // Percorre a string, contando ocorrências de 'a' e 'A'
        for (char c : caracteres) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
    }
}
```

## Requisitos

- Java 8 ou superior.