import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int valorInicial = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int valorFinal = scanner.nextInt();

        
        try {
            contar(valorInicial, valorFinal);  

        }catch(ParametrosInvalidosException erroParametro) {   
           System.out.println(erroParametro.getMessage());

        }finally {
            scanner.close();
        }
        
    }

    static void contar(int valorInicial, int valorFinal) throws ParametrosInvalidosException {

        if(valorInicial > valorFinal) throw new ParametrosInvalidosException("Segundo parâmetro deve ser maior que o primeiro.");
        int contagemFor = valorFinal - valorInicial;

        for(int i = 1; i <= contagemFor; i++) {
            System.out.printf("Imprimindo o número: %d\n", i);
        }

    }

    
}
