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


