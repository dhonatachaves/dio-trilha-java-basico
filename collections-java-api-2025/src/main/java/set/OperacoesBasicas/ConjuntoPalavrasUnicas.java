package main.java.set.OperacoesBasicas;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavrasUnicasSet.isEmpty()) {
            if(palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            }else {
                System.out.println("Palavra NÃO encontrada no conjunto para remoção!");
            }
        }else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);

        }else {
            System.out.println("O conjunto está vazio!");
        }
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasUnicas=" + palavrasUnicasSet +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        // Adicionando palavras avulsas no conjunto
        conjuntoPalavrasUnicas.adicionarPalavra("Aeromoça");
        conjuntoPalavrasUnicas.adicionarPalavra("Paralelepípedo");
        conjuntoPalavrasUnicas.adicionarPalavra("Conjuntivite");
        conjuntoPalavrasUnicas.adicionarPalavra("Fogaréu");

        // Verificando se uma palavra está presente no conjunto
        System.out.println("Palavra se encontra no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Fogaréu"));

        // Removendo uma palavra do conjunto
        conjuntoPalavrasUnicas.removerPalavra("Conjuntivite");

        // Exibindo todas as palavras presentes no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
