package ar.edu.unahur.obj2.wtoj.contenido;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentalTest {
    private Contenido tiburones;

    @BeforeEach
    void inicio() {
        tiburones = new Documental("Tiburones", 15.0);
        IDRA.getIsnstance().setValor(20.0);
    }

    @Test
    void testDoCosto() {
        assertEquals(20.0, tiburones.doCosto());
    }

    @Test
    void testGetCostoBase() {
        assertEquals(15.0, tiburones.getCostoBase());
    }

    @Test
    void testGetTitulo() {
        assertEquals("Tiburones", tiburones.getTitulo());
    }

    @Test
    void testSetCostoBase() {
        tiburones.setCostoBase(9.0);
        assertNotEquals(10.0, tiburones.getCostoBase());
        assertEquals(9.0, tiburones.getCostoBase());
    }
}
