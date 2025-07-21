package Iphone;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Iphone.modelo.Iphone;

public class Menu {

    public static Scanner scanner = new Scanner(System.in);
    public static Iphone iphone = new Iphone();

    Menu() {
        int option = -1;

        while (option != 4) {
            System.out.println("Selecione uma das opções: ");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Navegador na internet");
            System.out.println("4 - Sair");
            option = scanner.nextInt();

            if(option <= 0 || option > 4) {
                System.out.println("Opção inválida.");
                continue;
            }

            switch (option) {
                case 1 -> menuReprodutorMusical();
                case 2 -> menuAparelhoTelefonico();
                case 3 -> menuNavegadorNaInternet();
            }
        }

    }

    public static void menuReprodutorMusical() {

        int opcao = -1;
        List<String> musicas = Arrays.asList("Evidências", "Como é Grande o Meu Amor por Você", 
        "Tempo Perdido", "Aquarela", "Pais e Filhos",
         "Pais e Filhos");
        

        do {
            System.out.println("1 - ver playlist");
            System.out.println("2 - Selecionar Música");
            System.out.println("3 - Tocar Música");
            System.out.println("4 - Pausar Música");
            System.out.println("5 -  sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao <= 0 || opcao > 5) {
                System.out.println("Opção inválida.");
                continue;
            }


            switch (opcao) {
                case 1 -> iphone.verPlaylist(musicas);
                case 2 -> {
                    System.out.println("Informe o nome da música: ");
                    String musica = scanner.nextLine();
                    iphone.selecionarMusica(musicas, musica);
                }
                case 3 -> iphone.tocar();
                case 4 -> iphone.pausar();
            }
            
        } while(opcao != 5);    
    

    }

    public static void menuAparelhoTelefonico() {
        int opcao = -1;

        do {
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar correio de voz");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao <= 0 || opcao > 4) {
                System.out.println("Opção inválida.");
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o número para realizar a ligação: ");
                    String numero = scanner.nextLine();
                    iphone.ligar(numero);
                }
                case 2 -> iphone.atender();
                case 3 -> iphone.iniciarCorreioDeVoz();

            }



        }while (opcao != 4);
    }

    public static void menuNavegadorNaInternet() {

        int opcao = -1;

        do {
            System.out.println("1 - Exibir página");
            System.out.println("2 - Adicionar nova aba");
            System.out.println("3 - atualizar página");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao <= 0 || opcao > 4) {
                System.out.println("Opção inválida.");
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.println("Por favor informe a url: ");
                    String url = scanner.nextLine();
                    iphone.exibirPagina(url);
                }
                case 2 -> iphone.adicionarNovaAba();
                case 3 -> iphone.atualizarPagina();

            }

        }while (opcao != 4);

    }

 
}
