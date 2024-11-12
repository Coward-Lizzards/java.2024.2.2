import java.util.Scanner;
import model.*;
import service.PessoaService;
import service.ProdutoService;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Pessoa p = new Cliente();
        Produto pr = new Produto();
        PessoaService ps = new PessoaService();
        ProdutoService prs = new ProdutoService();

        System.out.println("Digite o nome:");
        p.setNome(sc.next());

        System.out.println("Digite a idade:");
        p.setIdade(sc2.nextInt());

        System.out.println("Digite o cpf:");
        p.setCpf(sc.next());


        ps.cadastrarPessoa(p);
        System.out.println(ps.listar());



    }
}