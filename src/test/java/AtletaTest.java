import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtletaTest {

    @Test
    void deveArmazenarEstados() {
        Atleta atleta = new Atleta();
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        assertEquals(2, atleta.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Atleta atleta = new Atleta();
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        atleta.restauraEstado(0);
        assertEquals(AtletaEstadoDescansando.getInstance(), atleta.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Atleta atleta = new Atleta();
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        atleta.setEstado(AtletaEstadoCaminhando.getInstance());
        atleta.setEstado(AtletaEstadoDescansando.getInstance());
        atleta.setEstado(AtletaEstadoCorrendo.getInstance());
        atleta.restauraEstado(2);
        assertEquals(AtletaEstadoDescansando.getInstance(), atleta.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Atleta aluno = new Atleta();
            aluno.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
