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
