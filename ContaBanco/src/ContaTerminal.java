import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // solicitando e capturando os dados do usuario.
        try ( // criando objeto Scanner para receber os dados do usuario pelo terminal.
                Scanner scanner = new Scanner(System.in)) {
            // solicitando e capturando os dados do usuario.
            System.out.println("Por favor, digite o número da Agência: ");

            String agencia = scanner.nextLine();   // Agencia é um texto, por isso usamos nextline().
            System.out.println("Por favor, digite o número da Conta: ");

            int numero = scanner.nextInt();   // Conta é um numero inteiro.

            // Foi necessario adicionar um nextLine apos um nextInt() para limpar o buffer.
            scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();   // Nome do cliente é um texto.

            System.out.println("Por favor, digite o Saldo da Conta: ");
            double saldo = scanner.nextDouble();   // saldo é um valor decimal.

            // Exibir mensagem final com os dados fornecidos pelo usuario.
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta conosco, " + "sua agência é " + agencia + ", conta " + numero + " e seu saldo de: " + saldo + " já está disponível para saque. Obrigado!");
            // FECHAR O SCANNER PARA EVITAR VAZAMENTO DE RECURSOS.
            scanner.close();
        }

    }
}