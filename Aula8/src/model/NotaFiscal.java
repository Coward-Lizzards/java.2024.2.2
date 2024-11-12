package model;

import enums.CategoriaProduto;

public class NotaFiscal {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;
    public void adicionaCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void adicionaProduto1(Produto produto) {
        this.produto1 = produto;
    }
    public void adicionaProduto2(Produto produto) {
        this.produto2 = produto;
    }
    public void adicionaProduto3(Produto produto) {
        this.produto3 = produto;
    }

    public Produto getProduto1() {
        return produto1;
    }

    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }

    public Produto getProduto2() {
        return produto2;
    }

    public void setProduto2(Produto produto2) {
        this.produto2 = produto2;
    }

    public Produto getProduto3() {
        return produto3;
    }

    public void setProduto3(Produto produto3) {
        this.produto3 = produto3;
    }

    public double valorTotal(){
        double total = produto1.calcularTotal() + produto2.calcularTotal() + produto3.calcularTotal();
        return total;
    }

    public void exibirNotaFiscal() {
        // Exibindo cabeçalho da nota fiscal
        System.out.println("---------NOTA-FISCAL---------");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println();

        // Exibindo detalhes dos produtos
        System.out.println("Produtos:");
        exibirDetalhesProduto(produto1);
        exibirDetalhesProduto(produto2);
        exibirDetalhesProduto(produto3);

        // Exibindo o valor total da nota
        System.out.println();
        System.out.println("Valor Total da Nota: R$ " + valorTotal());
        System.out.println("-----------------------------");
    }

    private void exibirDetalhesProduto(Produto produto) {
        // Aqui assume-se que o produto tem métodos para acessar nome, categoria, preço e quantidade
        double totalProduto = produto.getPreco() * produto.getQuantidade();
        System.out.println("- " + produto.getNome() +
                " | Preço: R$ " + produto.getPreco() +
                " | Quantidade: " + produto.getQuantidade() +
                " | Total: R$ " + totalProduto);
    }
}
