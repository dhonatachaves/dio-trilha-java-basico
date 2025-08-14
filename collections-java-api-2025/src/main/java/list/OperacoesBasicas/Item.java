package main.java.list.OperacoesBasicas;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        if (nome == null || nome.isBlank() || preco < 0 || quantidade <= 0) {
            throw new IllegalArgumentException("Dados inválidos para criação do item.");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s \n Preço: R$%.2f \n Quantidade(s): %d \n", getNome(), getPreco(), getQuantidade());
    }


}
