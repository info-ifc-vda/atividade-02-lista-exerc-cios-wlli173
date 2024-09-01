package Lista_2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] codigos = new int[10];
        double[] saldos = new double[10];

        // Leitura dos códigos e saldos das contas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta " + (i + 1) + ": ");
            codigos[i] = scanner.nextInt();
            
            // Verificação para garantir que o código da conta seja único
            for (int j = 0; j < i; j++) {
                if (codigos[i] == codigos[j]) {
                    System.out.println("Código já existente. Por favor, insira um código único.");
                    i--; // Volta para repetir a entrada do código
                    break;
                }
            }
            
            System.out.print("Digite o saldo inicial da conta " + (i + 1) + ": ");
            saldos[i] = scanner.nextDouble();
        }

        int opcao;

        // Menu
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Efetuar depósito");
            System.out.println("2 - Efetuar saque");
            System.out.println("3 - Consultar o ativo bancário");
            System.out.println("4 - Finalizar programa");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Efetuar depósito
                    System.out.print("Digite o código da conta para depósito: ");
                    int codigoDeposito = scanner.nextInt();
                    boolean contaEncontrada = false;
                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigoDeposito) {
                            System.out.print("Digite o valor do depósito: ");
                            double valorDeposito = scanner.nextDouble();
                            saldos[i] += valorDeposito;
                            System.out.println("Depósito realizado com sucesso.");
                            contaEncontrada = true;
                            break;
                        }
                    }
                    if (!contaEncontrada) {
                        System.out.println("Código da conta não encontrado.");
                    }
                    break;

                case 2:
                    // Efetuar saque
                    System.out.print("Digite o código da conta para saque: ");
                    int codigoSaque = scanner.nextInt();
                    contaEncontrada = false;
                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigoSaque) {
                            System.out.print("Digite o valor do saque: ");
                            double valorSaque = scanner.nextDouble();
                            if (saldos[i] >= valorSaque) {
                                saldos[i] -= valorSaque;
                                System.out.println("Saque realizado com sucesso.");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            contaEncontrada = true;
                            break;
                        }
                    }
                    if (!contaEncontrada) {
                        System.out.println("Código da conta não encontrado.");
                    }
                    break;

                case 3:
                    // Consultar o ativo bancário
                    double ativoBancario = 0;
                    for (int i = 0; i < 10; i++) {
                        ativoBancario += saldos[i];
                    }
                    System.out.println("Ativo bancário total: R$ " + ativoBancario);
                    break;

                case 4:
                    // Finalizar programa
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
