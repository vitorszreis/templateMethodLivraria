package padroescomportamentais.templatemethod;

public abstract class Livro {

    private int codigo;
    protected String titulo;
    private float precoCapa;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecoCapa() {
        return precoCapa;
    }

    public void setPrecoCapa(float precoCapa) {
        this.precoCapa = precoCapa;
    }

    public abstract float calcularDesconto();

    public float calcularFrete() {
        return 15.0f;
    }

    public float calcularPrecoFinal() {
        return this.precoCapa - this.calcularDesconto() + this.calcularFrete();
    }

    public String getTipo() {
        return "Livro";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", titulo='" + this.titulo + '\'' +
                ", precoFinal=" + this.calcularPrecoFinal() +
                '}';
    }
}
