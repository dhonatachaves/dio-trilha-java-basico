package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributo
    Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
       if(dicionario.isEmpty()) {
           System.out.println("Dicionário está vazio.");
           return;
       }

       if(dicionario.containsKey(palavra)) {
           dicionario.remove(palavra);
       }else {
           System.out.println("Palavra não encontrada no dicionário.");
           return;
       }
    }

    public void exibirPalavras() {
        if(dicionario.isEmpty()) {
            System.out.println("Dicionário está vazio.");
            return;
        }
        System.out.println("📚 Palavras no Dicionário:");
        dicionario.forEach((palavra, definicao) ->
                System.out.printf("- %s: %s%n", palavra, definicao));
    }

    public String pesquisarPorPalavra(String palavra) {
        if(dicionario.isEmpty()) {
            System.out.println("Dicionário está vazio.");
            return null;
        }

        if(dicionario.containsKey(palavra)) {
            return dicionario.get(palavra);
        }else {
            return "Palavra não encontrada no dicionário.";
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Dicionario
        Dicionario dicionario = new Dicionario();

        // Adicionando palavras e definicões ao dicionário
        dicionario.adicionarPalavra("Java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("Compilador", "Programa que traduz código-fonte para linguagem de máquina.");
        dicionario.adicionarPalavra("Algoritmo", "Sequência de passos para resolver um problema.");
        dicionario.adicionarPalavra("Variável", "Espaço na memória para armazenar um valor.");
        dicionario.adicionarPalavra("Classe", "Estrutura que define os atributos e comportamentos de um objeto.");

        //Exibe todas as palavras e definições
        dicionario.exibirPalavras();

        // Remove uma palavra do dicionário
        dicionario.removerPalavra("Compilador");

        // Pesquisa e imprime a definição da palavra "Java"
        System.out.println(dicionario.pesquisarPorPalavra("Java"));

    }
}
