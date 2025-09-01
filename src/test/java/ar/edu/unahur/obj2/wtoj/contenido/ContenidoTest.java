package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContenidoTest {
    private Contenido hombreAraña;

    @BeforeEach
    void inicio() {
        hombreAraña = new Pelicula("Hombre araña", 10.0);
    }

    @Test
    void testDoCosto() {
        assertEquals(0.0, hombreAraña.doCosto());
    }

    @Test
    void testGetCostoBase() {
        assertEquals(10.0, hombreAraña.getCostoBase());
    }

    @Test
    void testGetTitulo() {
        assertEquals("Hombre araña", hombreAraña.getTitulo());
    }

    @Test
    void testSetCostoBase() {
        hombreAraña.setCostoBase(9.0);
        assertNotEquals(10.0, hombreAraña.getCostoBase());
        assertEquals(9.0, hombreAraña.getCostoBase());
    }
}
