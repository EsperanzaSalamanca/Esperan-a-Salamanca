package es.uib.prgava.tema1.ejercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Ejercicio 1.1.7. */
class IdentificableTest {

    @Test
    void unServidorSeIdentificaPorSuNombre() {
        assertEquals("web01", new Servidor("web01").identificador());
    }

    @Test
    void unaDireccionSeIdentificaPorSuFormaConPuntos() {
        assertEquals("10.0.0.1", new DireccionIpv4(10, 0, 0, 1).identificador());
    }

    @Test
    void laEtiquetaFuncionaEnLasDosSinQueNingunaLaEscriba() {
        Identificable servidor = new Servidor("web01");
        Identificable direccion = new DireccionIpv4(10, 0, 0, 1);
        assertEquals("[web01]", servidor.etiqueta());
        assertEquals("[10.0.0.1]", direccion.etiqueta());
    }
}
