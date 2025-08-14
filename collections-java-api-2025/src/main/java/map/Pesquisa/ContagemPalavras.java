package main.java.map.Pesquisa;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //Atributos
    Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!contagemPalavras.isEmpty()) {
            if(contagemPalavras.containsKey(palavra)) {
                contagemPalavras.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada.");
            }
        }
    }

    public void exibirContagemPalavras() {
        if (!contagemPalavras.isEmpty()) {
            for(Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
                String palavra = entry.getKey();
                Integer contagem = entry.getValue();

                System.out.printf("- '%s' recorrência no texto: (%d) %n", palavra, contagem);
            }
        }
    }

    public String encontrarPalavraMaisFrequente() {

        if (!contagemPalavras.isEmpty()) {
            String palavraComMaiorFrequencia = null;
            Integer maiorFrequencia = 0;
            for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
                if(entry.getValue() > maiorFrequencia) {
                    palavraComMaiorFrequencia = entry.getKey();
                    maiorFrequencia = entry.getValue();
                }
            }

            if(palavraComMaiorFrequencia != null) {
                return "Palavra com maior frequência: '" + palavraComMaiorFrequencia + "' Contagem: (" + maiorFrequencia + ")";
            }
        }

        return null;
    }


    public static void main(String[] args) {
        // Criando uma instância da classe ContagemPalavras
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        // Adicionando palavras e o valor em que elas se repetem no texto
        contagemPalavras.adicionarPalavra("java", 5);
        contagemPalavras.adicionarPalavra("programacao", 3);
        contagemPalavras.adicionarPalavra("codigo", 7);
        contagemPalavras.adicionarPalavra("computador", 2);
        contagemPalavras.adicionarPalavra("algoritmo", 4);

        // Exibe as palavras e suas respectivas contagem
        contagemPalavras.exibirContagemPalavras();
        System.out.println("-------------------------------------------");

        // Remove a palavra código da lista  contagem
        contagemPalavras.removerPalavra("codigo");
        contagemPalavras.exibirContagemPalavras();
        System.out.println("-------------------------------------------");

        // Exibe a palavra com maior frequência
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
