package padroescomportamentais.templatemethod;

public class LivroDigital extends Livro {

    public float calcularDesconto() {
        return this.getPrecoCapa() * 0.10f;
    }

    @Override
    public float calcularFrete() {
        return 0.0f;
    }

    @Override
    public String getTipo() {
        return "LivroDigital";
    }
}
