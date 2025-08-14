package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosLista;

    public SomaNumeros() {
        this.numerosLista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosLista.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if(!numerosLista.isEmpty()) {
            for(Integer numero: numerosLista) {
               soma += numero;
            }
        }

        return soma;
    }

    public int encontrarMaiorNumero() {
        if(!numerosLista.isEmpty()) {
            return 0;
        }

        int maiorValor = numerosLista.get(0);
        for(int i = 1; i < numerosLista.size(); i++) {
            if(numerosLista.get(i) > maiorValor) {
                maiorValor = numerosLista.get(i);
            }
        }

        return maiorValor;
    }

    public int encontrarMenorNumero() {
        if(!numerosLista.isEmpty()) {
            return 0;
        }

        int menorValor = numerosLista.get(0);

        for(int i = 1; i < numerosLista.size(); i++ ) {
            if(numerosLista.get(i) < menorValor) {
                menorValor = numerosLista.get(i);
            }
        }

        return menorValor;
    }

    public void exibirNumeros() {
        if(!numerosLista.isEmpty()) {
            System.out.println(numerosLista);
        }
    }

    @Override
    public String toString() {
        return "numerosLista=" + numerosLista +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(-6);
        somaNumeros.adicionarNumero(32);

        System.out.println("Soma dos números encontrados na lista: " + somaNumeros.calcularSoma());
        System.out.println("Maior valor encontrado: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor valor encontrado: " + somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros);
    }
}
