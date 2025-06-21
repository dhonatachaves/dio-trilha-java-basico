import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        // Declaração de variáveis para o projeto
        String agency;
        String customerName;
        int accountNumber;
        double bankBalance;

        // Captura dados bancários do usuário
        System.out.println("Nome do cliente: ");
        customerName = entrada.nextLine();
        System.out.println("número da conta: ");
        accountNumber = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Número da agência: ");
        agency = entrada.nextLine();
        System.out.println("Saldo bancário: R$");
        bankBalance = entrada.nextDouble();
    }
}
