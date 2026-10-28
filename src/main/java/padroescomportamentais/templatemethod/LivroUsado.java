package padroescomportamentais.templatemethod;

public class LivroUsado extends Livro {

    public float calcularDesconto() {
        return this.getPrecoCapa() * 0.50f;
    }

    @Override
    public String getTipo() {
        return "LivroUsado";
    }
}
