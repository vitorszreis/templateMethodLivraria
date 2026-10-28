package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroUsadoTest {

    @Test
    void deveRetornarDesconto() {
        LivroUsado livro = new LivroUsado();
        livro.setPrecoCapa(50.0f);
        assertEquals(25.0f, livro.calcularDesconto(), 0.01f);
    }

    @Test
    void deveRetornarFrete() {
        LivroUsado livro = new LivroUsado();
        livro.setPrecoCapa(50.0f);
        assertEquals(15.0f, livro.calcularFrete(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFinal() {
        LivroUsado livro = new LivroUsado();
        livro.setPrecoCapa(50.0f);
        assertEquals(40.0f, livro.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        LivroUsado livro = new LivroUsado();
        livro.setPrecoCapa(50.0f);
        livro.setTitulo("Memórias Póstumas de Brás Cubas");
        livro.setCodigo(3);
        assertEquals("LivroUsado{codigo=3, titulo='Memórias Póstumas de Brás Cubas', precoFinal=40.0}", livro.getInfo());
    }
}
