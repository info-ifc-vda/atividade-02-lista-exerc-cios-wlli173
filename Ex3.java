package Lista_2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        int[] resultado1 = new int[10];
        int[] resultado2 = new int[10];

        
        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        
        System.out.println("Digite 5 números inteiros para o segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Calculando o primeiro vetor 
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) {  // Verifica se o número é par
                int soma = 0;
                for (int j = 0; j < vetor2.length; j++) {
                    soma += vetor2[j];  // Soma todos os números do segundo vetor
                }
                resultado1[i] = vetor1[i] + soma;
            } else {
                resultado1[i] = 0;  // Coloca 0 se não for par
            }
        }

        // Calculando o segundo vetor 
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 != 0) {  // Verifica se o número é ímpar
                int divisores = 0;
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor1[i] % vetor2[j] == 0) {  // Verifica se é divisor
                        divisores++;
                    }
                }
                resultado2[i] = divisores;
            } else {
                resultado2[i] = 0;  // Coloca 0 se não for ímpar
            }
        }
        
        //impressão
        System.out.println("Primeiro vetor resultante (soma de números pares com a soma do segundo vetor):");
        for (int i = 0; i < resultado1.length; i++) {
            if (resultado1[i] != 0) {
                System.out.print(resultado1[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Segundo vetor resultante (quantidade de divisores dos números ímpares no segundo vetor):");
        for (int i = 0; i < resultado2.length; i++) {
            if (resultado2[i] != 0) {
                System.out.print(resultado2[i] + " ");
            }
        }
        System.out.println();

        scanner.close();

    }
}
