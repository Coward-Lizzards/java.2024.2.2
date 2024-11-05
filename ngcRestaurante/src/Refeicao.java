public abstract class Refeicao implements AssinaturaDeMetodos{
    protected String nome;
    protected double preco;
    protected enum TipoRefeicaco{}

    public Refeicao(){}
    public Refeicao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void preparar(){
    }
    public void servir(){
    }

    @Override
    public void temperar() {

    }
    @Override
    public void esquentar() {

    }


}
