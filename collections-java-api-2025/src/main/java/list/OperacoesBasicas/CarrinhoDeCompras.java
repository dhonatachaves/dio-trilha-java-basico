package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome do item inválido.");
            return;
        }

        if (preco < 0) {
            System.out.println("Preço não pode ser negativo.");
            return;
        }

        if (quantidade <= 0) {
            System.out.println("Quantidade deve ser maior que zero.");
            return;
        }

        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaParaRemover = new ArrayList<>();

        for(Item i: carrinho) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                listaParaRemover.add(i);
            }
        }

        carrinho.removeAll(listaParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotalCarrinho = 0;

        for(Item i: carrinho) {
            if(i.getQuantidade() > 1) {
                valorTotalCarrinho += i.getPreco() * i.getQuantidade();
                continue;
            }

            valorTotalCarrinho += i.getPreco();
        }

        return valorTotalCarrinho;
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Café", 21.00, 3);
        carrinhoDeCompras.adicionarItem("Leite", 5.50, 2);
        carrinhoDeCompras.adicionarItem("Leite em pó", 8.30, 1);
        carrinhoDeCompras.adicionarItem("Gelatina", 6, 2);
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());

    }
}
