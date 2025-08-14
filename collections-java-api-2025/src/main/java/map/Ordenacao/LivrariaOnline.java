package main.java.map.Ordenacao;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    //Atributo
    Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livros.put(link, livro);
    }

    public void removerLivro(String titulo) {

            if(livros.isEmpty()) {
                System.out.println("A lista está vazia!");
                return;
            }
            List<String> chavesParaRemover = new ArrayList<>();
            for(Map.Entry<String, Livro> entry: livros.entrySet()) {
                if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    chavesParaRemover.add(entry.getKey());
                }
            }

            for(String chave: chavesParaRemover) {
                livros.remove(chave);
            }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        if(livros.isEmpty()) {
            System.out.println("A lista está vazia!");
            return null;
        }
        List<Map.Entry<String, Livro>> livrosAOrdenarPorPrecos = new ArrayList<>(livros.entrySet());
        Collections.sort(livrosAOrdenarPorPrecos, new ComparatorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry: livrosAOrdenarPorPrecos) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        if(livros.isEmpty()) {
            System.out.println("A lista está vazia!");
            return null;
        }
        Map<String, Livro> livrosPorAutor = new HashMap<>();

        for(Map.Entry<String, Livro> entry: livros.entrySet()) {
            Livro livro = entry.getValue();
            if(livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        if(livros.isEmpty()) {
            System.out.println("A lista está vazia!");
            return null;
        }
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        for(Livro l: livros.values()) {
            if(l.getPreco() > precoMaisAlto) {
                precoMaisAlto = l.getPreco();
            }
        }

        for(Map.Entry<String, Livro> entry: livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }

        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        if(livros.isEmpty()) {
            System.out.println("A lista está vazia!");
            return null;
        }
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        for(Livro l: livros.values()) {
            if(l.getPreco() < precoMaisBaixo) {
                precoMaisBaixo = l.getPreco();
            }
        }

        for(Map.Entry<String, Livro> entry: livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }

        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        System.out.println("Livros do autor: " + autorPesquisa);
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livros);


    }


}



