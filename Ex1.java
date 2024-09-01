package Lista_2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0; // Contador para controle das linhas
        double valor;

        while (true) {
            System.out.print("Digite um valor (negativo ou 0 para sair): ");
            valor = scanner.nextDouble();

            // Finaliza o programa se o valor for negativo ou 0
            if (valor <= 0) {
                break;
            }

            // Imprime o cabeçalho a cada 20 linhas
            if (count % 20 == 0) {
                System.out.printf("%-15s %-15s %-15s%n", "Valor", "Cubo", "Raiz Quadrada");
                System.out.println("-----------------------------------------------");
            }

            // Calcula o cubo e a raiz quadrada
            double cubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor);

            // Imprime a linha da tabela
            System.out.printf("%-15.2f %-15.2f %-15.2f%n", valor, cubo, raizQuadrada);

            count++;
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
