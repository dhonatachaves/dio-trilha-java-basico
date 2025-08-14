package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }


    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public Set<Produto> exibirProdutosPorCodigo() {
        Set<Produto> produtosPorCodigo = new TreeSet<>(new ComparatorPorCodigo());
        produtosPorCodigo.addAll(produtoSet);
        return produtosPorCodigo;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos á lista
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        // Exibindo a lista de produtos
        System.out.println(cadastroProdutos.produtoSet);

        // Ordenando á lista de produtos por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        // Ordenando á lista de produtos por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

        // Ordenando á lista de produtos por quantidade
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());

        // Ordenando á lista de produtos por código
        System.out.println(cadastroProdutos.exibirProdutosPorCodigo());
    }
}
