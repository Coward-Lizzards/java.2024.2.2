package service;
import model.*;
import java.util.ArrayList;

public class ProdutoService {
    private ArrayList<Produto> produtos = new ArrayList<>();
    public void cadastrarProduto(Produto p){
        produtos.add(p);
        System.out.println("Cadastrado com sucesso");
    }

    public ArrayList<Produto>listar(){
        return produtos;
    }
}
