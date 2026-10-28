package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroDigitalTest {

    @Test
    void deveRetornarDesconto() {
        LivroDigital livro = new LivroDigital();
        livro.setPrecoCapa(50.0f);
        assertEquals(5.0f, livro.calcularDesconto(), 0.01f);
    }

    @Test
    void deveRetornarFrete() {
        LivroDigital livro = new LivroDigital();
        livro.setPrecoCapa(50.0f);
        assertEquals(0.0f, livro.calcularFrete(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFinal() {
        LivroDigital livro = new LivroDigital();
        livro.setPrecoCapa(50.0f);
        assertEquals(45.0f, livro.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        LivroDigital livro = new LivroDigital();
        livro.setPrecoCapa(50.0f);
        livro.setTitulo("Grande Sertão: Veredas");
        livro.setCodigo(2);
        assertEquals("LivroDigital{codigo=2, titulo='Grande Sertão: Veredas', precoFinal=45.0}", livro.getInfo());
    }
}
