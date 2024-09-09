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
