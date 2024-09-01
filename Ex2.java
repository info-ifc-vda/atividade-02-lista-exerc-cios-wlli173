package Lista_2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] diferenca = new int[20];
        int index = 0;

        // Preenche o vetor1 com entradas do usuário
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Preenche o vetor2 com entradas do usuário
        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Compara vetor1 com vetor2 e adiciona números não comuns ao array diferenca
        for (int i = 0; i < vetor1.length; i++) {
            boolean comum = false;
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    comum = true;
                    break;
                }
            }
            if (!comum) {
                diferenca[index++] = vetor1[i];
            }
        }

        // Comparar os 2 vetores
        for (int i = 0; i < vetor2.length; i++) {
            boolean comum = false;
            for (int j = 0; j < vetor1.length; j++) {
                if (vetor2[i] == vetor1[j]) {
                    comum = true;
                    break;
                }
            }
            if (!comum) {
                diferenca[index++] = vetor2[i];
            }
        }

        

        // Imprime o vetor resultante
        System.out.println("Vetor dos números não comuns:");
        for (int i = 0; i < diferenca.length; i++) {
            if (diferenca[i] != 0) {
                System.out.print(diferenca[i] + " ");
            }
        }
        System.out.println();

        scanner.close();

    }
}
