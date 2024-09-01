package Lista_2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[7][7];
        int[] maiorLinha = new int[7];
        int[] menorColuna = new int[7];

        // Preenchendo a matriz 7x7
        System.out.println("Digite os elementos da matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Inicializando os vetores maiorLinha e menorColuna
        for (int i = 0; i < 7; i++) {
            maiorLinha[i] = matriz[i][0]; // Assume o primeiro elemento como o maior da linha
            menorColuna[i] = matriz[0][i]; // Assume o primeiro elemento como o menor da coluna
        }

        // Encontrando o maior elemento de cada linha
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (matriz[i][j] > maiorLinha[i]) {
                    maiorLinha[i] = matriz[i][j];
                }
            }
        }

        // Encontrando o menor elemento de cada coluna
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 7; i++) {
                if (matriz[i][j] < menorColuna[j]) {
                    menorColuna[j] = matriz[i][j];
                }
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Exibindo o vetor com os maiores elementos de cada linha
        System.out.println("\nVetor com o maior elemento de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.print(maiorLinha[i] + " ");
        }
        System.out.println();

        // Exibindo o vetor com os menores elementos de cada coluna
        System.out.println("\nVetor com o menor elemento de cada coluna:");
        for (int i = 0; i < 7; i++) {
            System.out.print(menorColuna[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
