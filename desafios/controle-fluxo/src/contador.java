import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int valorInicial = scanner.nextInt();
        System.out.println("Digite o segundo paramêtro: ");
        int valorFinal = scanner.nextInt();

        scanner.close();

    }
}
