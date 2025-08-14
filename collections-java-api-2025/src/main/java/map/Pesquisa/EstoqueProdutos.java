package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atributos
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        if(!estoqueProdutos.isEmpty()) {
            System.out.println(estoqueProdutos);
        }
    }

    public double calculaValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutos.isEmpty()) {
            for(Produto p: estoqueProdutos.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutos.isEmpty()) {
            for(Produto p: estoqueProdutos.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutos.isEmpty()) {
            for(Produto p: estoqueProdutos.values()) {
                if(p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoComMaiorValorNoEstoque() {
        Produto produtoMaiorValorEmEstoque = null;
        double maiorValorProdutoEmEstoque = 0d;

        if(!estoqueProdutos.isEmpty()) {
            for(Produto p: estoqueProdutos.values()) {
               double valorProdutoEmEstoque = p.getPreco() * p.getQuantidade();

               if(valorProdutoEmEstoque > maiorValorProdutoEmEstoque) {
                   maiorValorProdutoEmEstoque = valorProdutoEmEstoque;
                   produtoMaiorValorEmEstoque = p;
               }

            }
        }

        return produtoMaiorValorEmEstoque;

    }



    public static void main(String[] args) {
        //Criando uma instância da classe EstoqueProdutos
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        // Adicionando produtos ao EstoqueProdutos
        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0d);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 20d);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15d);
        estoqueProdutos.adicionarProduto(4L, "Produto D", 2, 18d);
        estoqueProdutos.adicionarProduto(5L, "Produto E", 2, 3d);
        estoqueProdutos.adicionarProduto(6L, "Produto F", 1, 150d);

        estoqueProdutos.exibirProdutos();

        // Exibe o valor total de produtos no estoque
        System.out.println("Valor total do estoque:  R$" + estoqueProdutos.calculaValorTotalEstoque());

        // Exibe o produto com maior valor no estoque
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

        // Exibe o produto com menor valor no estoque
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        // Exibe o produto com maior valor acumulado no estoque
        System.out.println("Produto com maior valor em estoque: " + estoqueProdutos.obterProdutoComMaiorValorNoEstoque());
    }
}
