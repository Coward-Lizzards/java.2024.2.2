package model;

public interface Calculavel {
    double TaxaManuseio = 10;
    double Imposto = 0.15;


    double calcularImposto(double imposto);

    double calcularImposto(double imposto, double preco);

    double calcularJuros();
    double calcularLucro();
    double calcularDesconto();
    double calcularTaxaManuseio(double TaxaManuseio);
    double calcularPrecoFinal();
    double calcularTotal();
}
