public class Entrada extends Refeicao {
    TipoRefeicao t;

    public TipoRefeicao getT() {
        return t;
    }

    public void setT(TipoRefeicao t) {
        this.t = t;
    }

    public Entrada(){}
    public Entrada(String nome, double preco, TipoRefeicao t) {
        super(nome, preco);
        this.t = t;
    }

    @Override
    public void preparar() {
        super.preparar();
    }

    @Override
    public void servir() {
        super.servir();
    }

    @Override
    public void temperar() {
        super.temperar();
    }

    @Override
    public void esquentar() {
        super.esquentar();
    }
}
