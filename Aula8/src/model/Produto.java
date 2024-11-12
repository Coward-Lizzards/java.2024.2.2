package model;

public class Produto implements Calculavel{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int Quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        quantidade = quantidade;
    }
    @Override
    public double calcularImposto(double imposto) {
        return 0;
    }

    @Override
    public double calcularImposto(double imposto, double preco) {
        return 0;
    }

    @Override
    public double calcularJuros() {
        return 0;
    }

    @Override
    public double calcularLucro() {
        return 0;
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }

    @Override
    public double calcularTaxaManuseio(double TaxaManuseio) {
        return 0;
    }

    @Override
    public double calcularPrecoFinal() {
        return 0;
    }

    @Override
    public double calcularTotal() {
        return 0;
    }

}
