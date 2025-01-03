import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura do número da Conta
        System.out.println("Por Favor, digite o número da Conta!");
        String numeroContaInput = scanner.nextLine(); // Lê como String
        int numeroConta = Integer.parseInt(numeroContaInput); // Converte para int

        // Solicitação e leitura do número da Agência
        System.out.println("Por Favor, digite o número da Agência!");
        String agencia = scanner.nextLine(); // Lê diretamente como String

        // Solicitação e leitura do nome do Cliente
        System.out.println("Por Favor, digite o seu nome!");
        String nomeCliente = scanner.nextLine();

        // Solicitação e leitura do saldo
        System.out.println("Por Favor, digite o seu saldo atual!");
        String saldoInput = scanner.nextLine(); // Lê como String
        double saldo = Double.parseDouble(saldoInput); // Converte para double

        // Exibição da mensagem formatada
        System.out.println("\nOlá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                agencia + ", conta " + numeroConta +
                " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
