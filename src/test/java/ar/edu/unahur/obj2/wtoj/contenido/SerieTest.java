package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SerieTest {
    private Serie dragonBall;

    private Temporada t1;
    private Temporada t2;

    private Capitulo c1t1;
    private Capitulo c2t1;
    private Capitulo c3t1;


    private Capitulo c1t2;
    private Capitulo c2t2;
    private Capitulo c3t2;

    @BeforeEach
    void inicio() {
        dragonBall = new Serie("Dragon Ball Z", 30.0);
                // Crear temporadas
        t1 = new Temporada(1);
        t2 = new Temporada(2);

        // Crear capítulos de la temporada 1
        c1t1 = new Capitulo("Piloto", 1, 9.99);
        c2t1 = new Capitulo("El misterio", 2, 12.50);
        c3t1 = new Capitulo("La revelación", 3, 15.00);

        // Crear capítulos de la temporada 2
        c1t2 = new Capitulo("Nuevo comienzo", 1, 10.50);
        c2t2 = new Capitulo("La alianza", 2, 13.25);
        c3t2 = new Capitulo("Traición", 3, 14.00);


        // Agregar capítulos a las temporadas
        t1.agregarCapitulo(c1t1);
        t1.agregarCapitulo(c2t1);
        t1.agregarCapitulo(c3t1);


        t2.agregarCapitulo(c1t2);
        t2.agregarCapitulo(c2t2);
        t2.agregarCapitulo(c3t2);

        dragonBall.agregarTemporada(t1);
        dragonBall.agregarTemporada(t2);
    }

    @Test
    void testDoCosto() {
        assertEquals(12.54, dragonBall.doCosto());
    }

    @Test
    void testGetCostoBase() {
        assertEquals(30.0, dragonBall.getCostoBase());
    }

    @Test
    void testGetTitulo() {
        assertEquals("Dragon Ball Z", dragonBall.getTitulo());
    }

    @Test
    void testSetCostoBase() {
        dragonBall.setCostoBase(9.0);
        assertNotEquals(10.0, dragonBall.getCostoBase());
        assertEquals(9.0, dragonBall.getCostoBase());
    }
}
