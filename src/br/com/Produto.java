package br.com;

public class Produto {
    private String produto;
    private double preco;

    public Produto(String produto, double valor) {
        this.produto = produto;
        this.preco = valor;
    }

    @Override
    public String toString(){
        return "Produto: " + produto + " | Valor: " + preco;
    }
}
