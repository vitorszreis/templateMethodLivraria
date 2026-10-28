package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroFisicoTest {

    @Test
    void deveRetornarDesconto() {
        LivroFisico livro = new LivroFisico();
        livro.setPrecoCapa(50.0f);
        assertEquals(0.0f, livro.calcularDesconto(), 0.01f);
    }

    @Test
    void deveRetornarFrete() {
        LivroFisico livro = new LivroFisico();
        livro.setPrecoCapa(50.0f);
        assertEquals(15.0f, livro.calcularFrete(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFinal() {
        LivroFisico livro = new LivroFisico();
        livro.setPrecoCapa(50.0f);
        assertEquals(65.0f, livro.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarInformacoes() {
        LivroFisico livro = new LivroFisico();
        livro.setPrecoCapa(50.0f);
        livro.setTitulo("Dom Casmurro");
        livro.setCodigo(1);
        assertEquals("Livro{codigo=1, titulo='Dom Casmurro', precoFinal=65.0}", livro.getInfo());
    }
}
