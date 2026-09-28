package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Ejercicio 1.1.2. */
class ServidorTest {

    @Test
    void unServidorNaceOperativo() {
        var web = new Servidor("web01");
        assertEquals("web01", web.nombre());
        assertFalse(web.estaEnMantenimiento());
        assertEquals("web01 (operativo)", web.toString());
    }

    @Test
    void elEstadoCambiaEnLosDosSentidos() {
        var web = new Servidor("web01");
        web.entrarEnMantenimiento();
        assertTrue(web.estaEnMantenimiento());
        assertEquals("web01 (en mantenimiento)", web.toString());
        web.salirDeMantenimiento();
        assertFalse(web.estaEnMantenimiento());
    }

    @Test
    void elContadorCuentaLosCreados() {
        int antes = Servidor.servidoresCreados();
        new Servidor("a");
        new Servidor("b");
        assertEquals(antes + 2, Servidor.servidoresCreados());
    }

    @Test
    void unNombreVacioEsRechazado() {
        assertThrows(IllegalArgumentException.class, () -> new Servidor(null));
        assertThrows(IllegalArgumentException.class, () -> new Servidor(""));
        assertThrows(IllegalArgumentException.class, () -> new Servidor("   "));
    }
}
